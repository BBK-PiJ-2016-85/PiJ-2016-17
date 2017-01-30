public class BookImpl implements Book {

   private String myAuthor;
   private String myTitle;

   public BookImpl(String author, String title) {
       myAuthor = author;
       myTitle = title;
   }

   public String getAuthorName() {
       return myAuthor;
   }

   public String getTitle() {
       return myTitle;
   }

}