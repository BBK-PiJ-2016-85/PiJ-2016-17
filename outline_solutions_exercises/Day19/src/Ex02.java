import java.util.Arrays;

public class Ex02 {
  public static void main(String[] args) {
    String[] words = {"hi", "hello", "hola", "bye", "goodbye", "adios"};
    System.out.print("Original array: ");
    System.out.println(Arrays.asList(words));

    Arrays.sort(words, Ex02::eChecker);

    System.out.print("Sorted by whether it contains 'e' [v2] : ");
    System.out.println(Arrays.asList(words));

  }

  private static int eChecker(String s1, String s2) {
    int compareFlag = 0;
    if (s1.contains("e") && !s2.contains("e")) {
      compareFlag = -1;
    } else if (s2.contains("e") && !s1.contains("e")) {
      compareFlag = 1;
    }
    return (compareFlag);
  }
}
