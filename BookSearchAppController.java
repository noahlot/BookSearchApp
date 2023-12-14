/**
 * Filename: BookSearchAppController.java
 * Description: Controller program managing events and app integration with API.
 * @author Noah Barajas
 * @date 2023-12-13
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ResourceBundle;
import java.util.prefs.Preferences;
import javafx.application.Platform;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

import java.lang.StringBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BookSearchAppController implements Initializable {
   // Variables used in FXML View for initial search page
   
   @FXML
   /**
    * ImageView for background image full of books.
    */
   private ImageView bgImg;
   @FXML
   /**
    * Background image full of books.
    */
   private Image bgBooks;
   
   @FXML
   /**
    * Dropdown menu for setting the user's language, which affects what results
    * the query returns and sets a user preference.
    */
   private MenuButton langMenu;
   /**
    * Below are languages which can be selected as the user's preference.
    */
   @FXML
   private MenuItem english;
   @FXML
   private MenuItem georgian;
   @FXML
   private MenuItem russian;
   @FXML
   private MenuItem italian;
   @FXML
   private MenuItem french;
   @FXML
   private MenuItem spanish;
   
   @FXML
   /**
    * The label "Keywords:" prompting the user to enter
    * search keywords/query into the field below.
    */
   private Label keyLabel;
   @FXML
   /**
    * The field in which a user can input keywords for their search.
    */
   private TextField keyInput;
   @FXML
   /**
    * The label "Publication Year:" prompting the user to enter
    * a year in which a book was published, in case they're looking
    * for a particular edition or just want to see all books published
    * that year.
    */
   private Label yearLabel;
   @FXML
   /**
    * The field in which the user inputs the publication year they're searching.
    */
   private TextField yearInput;
   @FXML
  /**
   * The label "Author:" prompting the user to enter an author name. This can be used
   * as a search parameter in addition to keywords/year or on its own.
   */
   private Label authorLabel;
   @FXML
   /**
    * The field in which the user can input an author's name.
    */
   private TextField authorInput;
   @FXML
   /**
    * A button the user hits to execute their search.
    */
   private Button searchButton;
   
   
   // Variables used in FXML View for search results page
   @FXML
   /**
    * ImageView for book cover art/images.
    */
   private ImageView coverImg;
   @FXML
   /**
    * Cover art for a given book.
    */
   private Image coverArt;
   
   @FXML
   private Label resultsLabel;
   @FXML
   private TextField bookTitle;
   @FXML
   private TextField yearPublished;
   @FXML
   private TextField authorName;
   
   @FXML
   private Button goBackButton;
   @FXML
   private Button prevBook;
   @FXML
   private Button nextBook;
   
   // Variables for internal use within Controller
   
   /**
    * HttpClient to acquire data from API.
    */
   private HttpClient client;
   /**
    * Start of url used to acquire JSON from API, added onto to form queries
    */
   private final String endpoint = "https://openlibrary.org/search.json?";
   /**
    * Top level of class hierarchy to hold current search data (parsed by GSON)
    */
   private Search search;
   /**
    * Index/position of currently viewed book in array docs.
    */
   private int docsPos;
   /**
    * The limit of how many results can be returned to Search at once by a query.
    */
   private final int LIMIT = 5;
   
   // User input for search query
   /**
    * Search keywords that the user enters.
    */
   private String keyInputText;
   /**
    * A publication year that the user enters.
    */
   private String yearInputText;
   /**
    * An author name that the user enters.
    */
   private String authorInputText;
   /**
    * URL of most recently run search.
    */
   private String lastSearch;
   /**
    * The key with which to store the user's language preference.
    */
   public static final String LANG_PREF = "lang_pref_key";
   
   
   // Variables for setting up/switching between scenes
   protected Stage stage;
   protected Scene scene;
   protected Parent root;
   
   // Methods to manage input for search
   
   /**
    * The handleUserInput method runs when the user adds or changes text in
    * any of the editable text fields and stores that text in order to create
    * the search query later on.
    * @param event An ActionEvent of text being entered or changed.
    */
   @FXML
   protected void handleUserInput(ActionEvent event) {
         if (event.getSource() == keyInput) keyInputText = this.keyInput.getText();
         System.out.println(this.keyInput.getText());
         if (event.getSource() == yearInput) yearInputText = this.yearInput.getText();
         System.out.println(this.yearInput.getText());
         if (event.getSource() == authorInput) authorInputText = this.authorInput.getText();
         System.out.println(this.authorInput.getText());
   }
   
   /**
    *
    */
   @FXML
   protected void setLanguage(ActionEvent event) {
      String langCode = null;
      if (event.getSource() == english) langCode = "eng";
      if (event.getSource() == georgian) langCode = "geo";
      if (event.getSource() == russian) langCode = "rus";
      if (event.getSource() == italian) langCode = "ita";
      if (event.getSource() == french) langCode = "fre";
      if (event.getSource() == spanish) langCode = "spa";
      Preferences p = Preferences.userNodeForPackage(BookSearchAppController.class);
      if (langCode != null) p.put(LANG_PREF, langCode);
   }
   
   /**
    * The inputToQuery converts text from user input into a formatted string
    * of text to be added onto the query URL for the API call (i.e. converting
    * keywords Goodnight Moon into "Goodnight+Moon", or Mark Twain into "Mark+Twain").
    * @param input The text the user entered as keywords or author.
    * @return String without whitespace to append to endpoint url.
    */
   protected String inputToQuery(String input) {
      String q = "";
      StringBuilder formattedText = new StringBuilder();
      String[] splitInput;
      // check if there are keywords in this query
      if (input != null) {
         // split by whitespace into different words
         splitInput = input.split(" ");
         // add on the first word
         formattedText.append(splitInput[0]);
         // replace whitespace with "+" between words
         for (int i = 1; i < splitInput.length; i++) {
            formattedText.append("+" + splitInput[i]);
         }
         q = formattedText.toString();
      }
      return q;
   }
   
   /**
    * The createQuery method builds a String of the URL to be used for the API call
    * for the current search. This takes into account any user input (however, title/
    * keywords and year published cannot both be used as parameters in a search, so 
    * the search will only take the year into account if no keywords are entered.
    * @return String of endpoint url with query parameters.
    */
   protected String createQuery() {
      StringBuilder queryURLString = new StringBuilder(this.endpoint);
      if (keyInputText != null) queryURLString.append("q=" + inputToQuery(keyInputText));
      // search parameters cannot include both year published and keywords,
      // so year will only be included in the search if no keywords were entered
      else if (yearInputText != null) queryURLString.append("q=first_publish_year%3A" + inputToQuery(yearInputText));
      if (authorInputText != null) queryURLString.append("&author=" + inputToQuery(authorInputText));
      // add on language preference if set
      Preferences p = Preferences.userNodeForPackage(BookSearchAppController.class);
      if (p.get(LANG_PREF, null) != null) queryURLString.append("&language=" + p.get(LANG_PREF, ""));
      // add limit to query
      queryURLString.append("&limit=" + LIMIT);
      return queryURLString.toString();
   }
   
   /**
    * This updateQuery method grabs the next set of results by updating the offset
    * parameter of the link used for the API call.
    */
   protected void updateQuery(String lastSearch) {
      // COME BACK TO THIS TO SET UP OFFSET
      if (docsPos >= LIMIT) {
         String offset = "&offset=" + ((docsPos / LIMIT) * LIMIT);
         try {
            this.runQueryFromString(lastSearch.concat(offset));
         } catch (IOException e) {
            System.out.println("Error updating query");
         }
      }
   }
   /**
    * The runQuery method will send a request to the API for book info.
    */
   @FXML
   protected void runQuery() throws IOException {
      System.out.println("Start of runQuery()"); // TEST
      // create http client if it doesn't already exist
      if(this.client == null) this.client = HttpClient.newHttpClient();
      URI queryURI = null;
      Gson gson = new Gson();
      try {
         // set up url
         queryURI = new URI(this.createQuery());
      } catch (Exception e) { 
            System.out.println("Invalid URL for API request");
          }
      // this try-catch is adapted from the Sample Temperature App project
      try {
         HttpRequest request = HttpRequest.newBuilder().uri(queryURI).GET().build();
         HttpResponse response = this.client.send(request, BodyHandlers.ofString());
         this.search = gson.fromJson(response.body().toString(), Search.class);
         this.lastSearch = queryURI.toString();
         System.out.println(this.lastSearch);
      } catch(InterruptedException e) { 
            System.out.println("Interrupted exception");
          }
   }
   
   
   
   /**
    * This runQuery method can be run without a button press or other action,
    * but serves the same purpose. It doesn't switch the scene.
    */
   protected void runQueryFromString(String query) throws IOException {
      // create http client if it doesn't already exist
      if(this.client == null) this.client = HttpClient.newHttpClient();
      URI queryURI = null;
      Gson gson = new Gson();
      // set up url
      try {
      queryURI = new URI(query);
      } catch (Exception e) { 
         System.out.println("Invalid URL for API request");
      }

      // this try-catch is adapted from the Sample Temperature App project
      try {
         HttpRequest request = HttpRequest.newBuilder().uri(queryURI).GET().build();
         HttpResponse response = this.client.send(request, BodyHandlers.ofString());
         this.search = gson.fromJson(response.body().toString(), Search.class);
      } catch(Exception e) { 
            System.out.println("Invalid URL for API request");
          }
   }
   
   @FXML
   public void switchSceneResults(ActionEvent event) throws Exception {
      // switch to other scene (this code for switching between scenes is adapted
      // from a tutorial here: https://youtu.be/hcM-R-YOKkQ?si=2ejYWJaA0FOwRghX
      try {
         System.out.println("before scene switch"); // TEST
         this.runQuery();
         root = FXMLLoader.load(getClass().getResource("SearchResults.fxml"));
         stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
         stage.setScene(scene);
         stage.show();
         Thread.sleep(1000);
         
         System.out.println(docsPos % LIMIT);
         System.out.println(search.getDocs()[0].toString());
         System.out.println("after scene switch"); // TEST
         displayBookInfo(search.getDocs()[(docsPos % LIMIT)]);
      } catch (IllegalArgumentException e) {
         System.out.println("Illegal argument exception");
      }  
   }  
   
   /**
    * This method goes back to the search page when the back button is clicked.
    */
   @FXML
   protected void goBack(ActionEvent event) throws IOException {
      // switch to other scene (this code for switching between scenes is adapted
      // from a tutorial here: https://youtu.be/hcM-R-YOKkQ?si=2ejYWJaA0FOwRghX
      try {
      root = FXMLLoader.load(getClass().getResource("BookLibraryApp.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show(); } catch (Exception e) {
         System.out.println("Unable to return to initial search page");
      }
   }
   
   /**
    * This methods displays info about the book currently being viewed
    */
   @FXML
   protected void displayBookInfo(Book book) {
      /*String coverURLString = 
         String.format("https://covers.openlibrary.org/a/id/%s.jpg",
                        book.getCoverID());
      //URI coverURL = new URI(coverURLString);
      try {
         coverArt = new Image(coverURLString);
         coverImg.setImage(coverArt);
      } catch (Exception e) { 
            System.out.println("Unable to load cover art");
      }
      */
      bookTitle.setText(book.getTitle());
      yearPublished.setText(book.getYearForView());
      authorName.setText(book.getAuthorForView());
   }
   
   @FXML
   protected void previousBookClick(ActionEvent event) {
      docsPos--;
      updateQuery(lastSearch);
      System.out.println(search.getDocs()[(docsPos % LIMIT)].toString());
      displayBookInfo(search.getDocs()[(docsPos % LIMIT)]);
   }
   
   @FXML
   protected void nextBookClick(ActionEvent event) {
      docsPos++;
      updateQuery(lastSearch);
      System.out.println(search.getDocs()[(docsPos % LIMIT)].toString());
      displayBookInfo(search.getDocs()[(docsPos % LIMIT)]);
   }
   
   /**
    * This method initializes the program and sets preferences.
    */
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      keyInputText = null;
      yearInputText = null;
      authorInputText = null;
      lastSearch = null;
      docsPos = 0;
            
      Preferences p = Preferences.userNodeForPackage(BookSearchAppController.class);
      p.get(LANG_PREF, "eng");
   }
   
}