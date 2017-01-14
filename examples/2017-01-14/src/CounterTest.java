import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by keith on 14/01/2017.
 */
public class CounterTest {
  private Counter count;

  @Before
  public void setUp(){
    count = new Counter();
  }

  @Test
  public void testIncrement(){
    assertEquals(1,count.increment());
  }

  @After
  public void tearDown(){
    count = null;
  }



}
