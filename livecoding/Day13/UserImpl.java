public class UserImpl implements User {

   private String name; 
   private int id;

   public UserImpl(String name) {
      this.name = name;
   }

   public void register(Library library) {
      id = library.registerUser(this);
   }

   public int getId() {
      return id;
   }


   public String getName() {
      return name;
   }

}