public class LibraryMock implements Library {

   private int counter = -1;

   public int registerUser(User user) {
       counter++;
       return counter;
   }
  
}