package ex07;

import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class QuicksortTest {

    private final static int SIZE = 50;
    private final static int MAX = 1000;
    private int[] numbers;

    @Before
    public void setUp() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }

    @Test
    public void testNull() {
        Quicksort sorter = new Quicksort();
        sorter.sort(null);
    }

    @Test
    public void testEmpty() {
        Quicksort sorter = new Quicksort();
        sorter.sort(new int[0]);
    }

    @Test
    public void testSimpleElement() {
        Quicksort sorter = new Quicksort();
        int[] test = new int[1];
        test[0] = 5;
        sorter.sort(test);
    }


    @Test
    public void testQuickSort() {
        printList("Initial list: ", numbers);

        Instant start = Instant.now();

        Quicksort sorter = new Quicksort();
        sorter.sort(numbers);

        printList("Sorted list: ", numbers);

        Instant end = Instant.now();

        System.out.println("Quicksort timing: " + Duration.between(start, end));

        if (!validate(numbers)) {
            fail("Should not happen");
        }
        assertTrue(true);
    }

    private void printList(String header, int[] numbers) {
        System.out.print(header);
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Test
    public void testStandardSort() {
        printList("Initial list: ", numbers);

        Instant start = Instant.now();
        Arrays.sort(numbers);
        Instant end = Instant.now();

        printList("Sorted list: ", numbers);

        System.out.println("Standard Java sort " + Duration.between(start, end));
        if (!validate(numbers)) {
            fail("Should not happen");
        }
        assertTrue(true);
    }

    private boolean validate(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
