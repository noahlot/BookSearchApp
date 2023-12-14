/**
 * Filename: Book.java
 * Description: Class to contain data on an individual book returned by a search query,
 *              including the book title, initial publication date/year, author's name,
 *              and cover ID which can be used with the Covers API to look up the
 *              associated book cover.
 * @author Noah Barajas
 * @date 2023-12-11
 */
 import java.lang.Integer;
 import java.lang.StringBuilder;
 
 public class Book {
   // Class fields
   
   /**
    * The title of this book.
    */
   private String title;
   
   /**
    * The name (or names) of the book's author(s). This is returned by the API as an
    * array because some books have multiple authors, but the array could contain only
    * one String object, or this field might not be returned if a book has no known author.
    */
   private String[] author_name;
   
   /**
    * The year during which this book was first published. Most books will have
    * multiple publication dates listed because of translations and reissues.
    */
   private Integer first_publish_year;
   
   /**
    * OpenLibrary's internal CoverID which can be used with the Covers API in order
    */
   private Integer cover_i;
   
   
   // Getter/Accessor methods
   
   /**
    * The getTitle method returns the book's title as a String.
    * @return The book title.
    */
   public String getTitle() {
      return title;
   }
    
   /**
    * The getAuthorNames returns a String array of the book's authors' (of which
    * there may be more than one) names.
    * @return An array of author names
    */
   public String[] getAuthorNames() {
      return author_name;
   }
    
   /**
    * This getAuthors method parses data from the author_name array and returns a formatted String
    * which contains these author's names (or just one name if there's only one author).
    * @return Formatted string with author name(s) for use with other methods.
    */
   public String getAuthors() {
      // if no author names are listed, return null
      if (this.getAuthorNames() == null) return null;
      
      // create an empty String
      String authorString = "";
      // get first name listed in array
      authorString = authorString.concat(this.getAuthorNames()[0]);
      
      // concatenate any additional author names
      for (int i = 1; i < getAuthorNames().length; i++) {
         authorString = authorString.concat(", " + getAuthorNames()[i]);
      }
      
      return authorString;
   }
   
   /**
    * The getFirstPublishYear method returns the earliest/initial publication
    * year for a given book. There are often other publication dates listed
    * besides when the book was first published because of translations and reissues.
    * @return The book's first publication year.
    */
   public Integer getPublishYear() {
      return first_publish_year;
   }
   
   /**
    * The getCoverID method returns the internal ID that the OpenLibrary uses to
    * identify the corresponding book cover image. This can be used in a query to
    * the Covers API to return the link to the actual image.
    * @return The unique identifier for the book's cover art/image.
    */
   public Integer getCoverID() {
      return cover_i;
   }
   
   // Other methods (toString and those used for app view)
   
   /**
    * The getYearForView method returns the string to be used within the view
    * of the app for the first publication year, without combining it with other
    * data or adding newline characters. If the year is not listed, it returns
    * "Publication Year not Listed".
    * @return String with the year in which the book was published, for use in app view.
    */
   public String getYearForView() {
      // check that publication year is not null
      if (this.getPublishYear() != null) {
         // return publication year
         return String.format("Published in %d", this.getPublishYear());
      }
      // if year not listed, return "Publication Year not Listed"
      else return "Publication Year not Listed";
   }
   /**
    * The getAuthorForView method returns the string to be used within the view
    * of the app for the author names, without combining it with other
    * data or adding newline characters. If no author is listed, it returns
    * "Author not Listed". If more than one is listed, all names are returned.
    * @return String with author name(s)/data, for use in app view.
    */
   public String getAuthorForView() {
      // check that author is not null
      if (this.getAuthors() != null) {
         return String.format("Written by %s", this.getAuthors());
      }
      // if no author names are listed, return "Author not Listed"
      else return "Author not Listed";
   }
   /**
    *
    *
    */
   
   /**
    * The toString method returns a formatted String of information on a given book,
    * specifically the title, initial publication year, and author(s).
    * Modified to call other methods 
    * @return Formatted string of book info.
    */
   public String toString() {
      // create StringBuilder
      StringBuilder bookInfo = new StringBuilder();
      // add title, year published, and author
      bookInfo.append(this.getTitle());
      bookInfo.append("\n" + this.getYearForView());
      bookInfo.append("\n" + this.getAuthorForView());
      
      return bookInfo.toString();
   }
 }