import org.junit.Test;
import static org.junit.Assert.*;

public class UserShould {


 /* code missing here from 1.2 */

   @Test
   public void registerWithLibraryAndGetId() {
      User user = new UserImpl("John");
      Library library = new LibraryMock();
      user.register(library);
      int expected = 0;
      assertEquals(expected, user.getId());
   }

   @Test
   public void registerWithLibraryAndGetUniqueId() {
      User john = new UserImpl("John");
      User matt = new UserImpl("Matt");
      Library library = new LibraryMock();
      john.register(library);
      matt.register(library);
      assertTrue(john.getId() != matt.getId());
   }

}