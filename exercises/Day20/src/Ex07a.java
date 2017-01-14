import java.util.Arrays;
import java.util.List;

/**
 * Turn the strings in the array words into uppercase, keep only the ones that are shorter than 4 characters, and,
 * of what remains, keep only the ones that contain “e”, and print the result.
 * Repeat the process, except checking for a “q” instead of  an “e”.
 */
public class Ex07a {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    //  using helper method to avoid repeating code
    String result1 = firstFunnyString(words, "E");
    System.out.println("Uppercase short word with 'E': " + result1);
    String result2 = firstFunnyString(words, "Q");
    System.out.println("Uppercase short word with 'Q': " + result2);
  }

  public static String firstFunnyString(List<String> words,
                                        String containedTest) {
    String result =
      words.stream()
        .map(String::toUpperCase)
        .filter(s -> s.length() < 4)
        .filter(s -> s.contains(containedTest))
        .findFirst().orElse("No match");
    return result;
  }
}
