import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UtilitiesShould {

   @Test
   public void returnAdditionOfTwoNumbers() {
       Utilities utility = new Utilities();
       int actual = utility.add(3, 5);
       int expected = 8;
       assertEquals(expected, actual);
   }

   @Test
   public void returnAPositiveHashcode() {
       Utilities utility = new Utilities();
       int actual = utility.shortHash("John");
       assertTrue(actual >= 0);
   }

   @Test
   public void returnHashcodeUnder1000() {
       Utilities utility = new Utilities();
       int actual = utility.shortHash("John");
       assertTrue(actual < 1000);
   }

}