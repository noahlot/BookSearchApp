/**
 * Filename: Search.java
 * Description: Class to contain data on search query, number of returned results,
 *              and array of returned results (individual books).
 * @author Noah Barajas
 * @date 2023-12-11
 */
import java.lang.Integer;

public class Search {
   // Class fields
   
   /**
    * The number of results returned by the most recently run search.
    */
   private int numFound;
   
   /**
    * The ordinal number or position (1st, 2nd, etc.) of the first work returned
    * within the array in this query's overall result set, where 0 means first.
    * This might be greater than 0 if offset (which skips a set number of initial
    * results) is not null, or if pagination is being used (which skips 100 results
    * at a time).
    */
   private int start;
   
   /**
    * The number of results that the search ignores or skips over; if offset is set
    * to 5, the returned results will exclude what would have been results 0 through 5.
    * This value is null by default if not set by the search query.
    */
   private Integer offset;
   
   /**
    * The search query/keywords the user had input.
    */
   private String q;
   
   /**
    * The array of individual book results returned by the search query.
    */
   private Book[] docs;
   
   // Getters/Accessor methods
   
   /**
    * The getNumFound method returns the total number of results that
    * this search query returned, in terms of number of books.
    * @return Total quantity of books matching the query.
    */
   public int getNumFound() {
      return numFound;
   }
   
   /**
    * The getStart method returns what the ordinal position of the first book
    * in docs (the result array) is within the overall search results without
    * use of an offset or pagination. 0 means this starts with the 1st returned
    * book overall, 1 means 2nd, 100 means 101st book, etc.
    * @return Ordinal position of first book within array docs.
    */
   public int getStart() {
      return start;
   }
   
   /**
    * The getOffset method returns the number of initial results that the search
    * is skipping over: if the offset is 3, the query will skip over the first 3
    * results, and docs with start with the 4th result (which would be id 3) as
    * the 1st result (or position 0 in docs). Null by default.
    * @return The number of initial results skipped over.
    */
   public Integer getOffset() {
      return offset;
   }
   
   /**
    * The getQuery method returns the query of keyword(s) that the user entered
    * for the current search, returning relevant books.
    * @return The search query keywords/text.
    */
   public String getQuery() {
      return q;
   }
   
   /**
    * The getDocs method returns the array of books resulting
    * from the most recently run search query.
    * @return The array of individual books.
    */
   public Book[] getDocs() {
      return docs;
   }
}

/*
 * Note to self: Make sure you use the limit url parameter to only grab data on a few books (like 4 or 5) at a time.
 *               If the user continues to click the "next book" button past that point, you can use the offset to
 *               grab the next set of 5 books (so to load books 5-9 into the array, the query would run again, only
 *               the url format would end with "&limit=5&offset=5").
 *               Use the String.format method and a variable keeping track of which result the user is currently viewing.
 *               You could also use "&limit=1" to load in one result at a time, just make sure you aren't asking for
 *               hundreds of results every time a query is run.
 */