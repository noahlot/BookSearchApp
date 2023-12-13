/**
 * Filename: OffsetLimitTestProgram.java
 * Description: Program to test using the offset and limit parameters of the OpenLibrary
 *              Search API in order to limit how many book results are returned at a time,
 *              and implement basic pagination. If a user asks for further results beyond
 *              those returned by the limited query, another query is run which uses the
 *              offset to return the next limited set of books (i.e. books 0-4, then 5-9).
 * @author Noah Barajas
 * @date 2023-12-13
 */

//import java.util.Scanner;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

import java.lang.StringBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OffsetLimitTestProgram {
   public static void main(String[] args) throws Exception {
      Gson gson = new Gson();
      HttpClient client = HttpClient.newHttpClient();
      String keywords = "Goodnight Moon"; // keywords in search query
      final int LIMIT = 5; // number of results to be returned by each query
//    String results = """
//                     """;
      // create a StringBuilder initialized to the beginning of the URL for an API call
      StringBuilder endpoint = new StringBuilder("https://openlibrary.org/search.json?");
      URI queryURL;
      HttpRequest request;
      HttpResponse response;
      
      // add search query onto endpoint link
      endpoint.append(keywordToQuery(keywords));
      if (LIMIT != 0) endpoint.append(String.format("&limit=%d", LIMIT));
      // note: add in logic for pagination to set offset as well
      
      System.out.println(endpoint.toString());
      queryURL = new URI(endpoint.toString());
      //Scanner s = new Scanner(url.openStream());
      request = HttpRequest.newBuilder().uri(queryURL).GET().build();
      response = client.send(request, BodyHandlers.ofString());
                       
      // code below is copy pasted from my APITestDriver program
      Search search = gson.fromJson(response.body().toString(), Search.class);
      for (Book b : search.getDocs()) {
         System.out.println(b.toString());
         System.out.println();
      }         
      
   }
   /**
    * Method to be brought over to Controller program, converts text from user input into
    * the string of text added onto the query URL for the API call (i.e. converting keywords
    * "Goodnight Moon" into "q=Goodnight+Moon").
    * @param keywords The text the user entered for the title as part of the search query.
    * @return Query string to append to endpoint url.
    */
   protected static String keywordToQuery(String key) {
      String q = "";
      StringBuilder query = new StringBuilder("q=");
      String[] keywords;
      // check if there are keywords in this query
      if (key != null) {
         // split by whitespace into different words
         keywords = key.split(" ");
         // add on the first word
         query.append(keywords[0]);
         // replace whitespace with "+" between words
         for (int i = 1; i < keywords.length; i++) {
            query.append("+" + keywords[i]);
         }
         q = query.toString();
      }
      return q;
   }
}