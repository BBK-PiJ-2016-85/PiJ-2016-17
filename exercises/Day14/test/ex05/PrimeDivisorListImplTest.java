package ex05;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeDivisorListImplTest {

    private PrimeDivisorList l;

    @Before
    public void setUp() {
        l = new PrimeDivisorListImpl(126);
    }


    @Test(expected = NullPointerException.class)
    public void testAddNullGetException() {
        Integer i = null;
        l.add(i);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNonPrimeGetException() {
        Integer i = 10;
        l.add(i);
    }

    @Test
    public void testExampleInExercise() {
        String expected = "[ 2 * 3^2 * 7 ] = 126";
        assertEquals(expected, l.toString());
    }
}
