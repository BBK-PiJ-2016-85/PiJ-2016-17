package samples.recursion;

public class Ternary {
  private static final int SEGMENTS = 3;

  public static void main(String... argv) {
    // Fill an array with some values - for testing.
    int[] testData = {24, 32, 41, 42, 51, 63, 71, 73, 85, 87};

    // Create a test value to search for.
    int searchTerm = 32;

    System.out.println(ternarySearch(testData, searchTerm, 0,
        testData.length - 1));
  }

  static boolean ternarySearch(int[] A, int value, int start, int end) {
    if (start > end) {
      return false;
    }

    // First boundary: add 1/SEGMENTS of length to start.
    int mid1 = start + (end - start) / SEGMENTS;

    // Second boundary: add 2/SEGMENTS of length to start.
    int mid2 = start + 2 * (end - start) / SEGMENTS;

    if (A[mid1] == value || A[mid2] == value) {
      return true;
    } else if (value < A[mid1]) {
      // Search 1st third.
      return ternarySearch(A, value, start, mid1 - 1);
    } else if (value > A[mid2]) {
      // Search 3rd third.
      return ternarySearch(A, value, mid2 + 1, end);
    } else {
      // Middle third.
      return ternarySearch(A, value, mid1, mid2);
    }
  }

}
