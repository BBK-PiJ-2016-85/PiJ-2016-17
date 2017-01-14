package ex1_03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserImplTest {
  private User u;
  private Library bbk;

  @Before
  public void setup() {
    u = new UserImpl("Anna");
    bbk = new LibraryImpl();
  }

  @Test
  public void testConstructorAndGetterForName() {
    assertEquals("Anna", u.getName());
  }

  @Test
  public void testGetterForIDBeforeIDSet() {
    assertEquals(0, u.getID());
  }

  @Test
  public void testGetterForIDAfterIDSet() {
    u.setID(11);
    assertEquals(11, u.getID());
  }

  // additional tests for 1.3

  @Test
  public void testGetLibrary() {
    u.register(bbk);
    assertEquals(bbk, u.getLibrary());
  }

  @Test
  public void testRegisterGetsTheUserID13() {
    assertEquals(13, u.register(bbk));
    assertEquals(13, u.getID());
  }
}
