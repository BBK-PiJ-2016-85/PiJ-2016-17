import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
  public static void main(String[] args) {
    String[] words = {"hi", "hello", "hola", "bye", "goodbye", "adios"};
    System.out.print("Original array: ");
    System.out.println(Arrays.asList(words));

    Arrays.sort(words, new StringComparatorByLength());

    System.out.print("Sorted by length ascending (with class): ");
    System.out.println(Arrays.asList(words));

    Arrays.sort(words, (String s1, String s2) ->
      {
        return s1.length() - s2.length();
      }
    );

    Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());

    System.out.print("Sorted by length ascending (with lambda): ");
    System.out.println(Arrays.asList(words));

    Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());

    System.out.print("Sorted by length descending : ");
    System.out.println(Arrays.asList(words));

    Arrays.sort(words, (s1, s2) -> s1.charAt(0) - s2.charAt(0));

    System.out.print("Sorted by first letter : ");
    System.out.println(Arrays.asList(words));

    Arrays.sort(words, (s1, s2) ->
    {
      int compareFlag = 0;
      if (s1.contains("e") && !s2.contains("e")) {
        compareFlag = -1;
      } else if (s2.contains("e") && !s1.contains("e")) {
        compareFlag = 1;
      }
      return (compareFlag);
    });

    System.out.print("Sorted by whether it contains 'e' [v1] : ");
    System.out.println(Arrays.asList(words));

    Arrays.sort(words, Ex01::eChecker);

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

class StringComparatorByLength implements Comparator<String> {
  @Override
  public int compare(String s1, String s2) {
    return s1.length() - s2.length();
  }
}
