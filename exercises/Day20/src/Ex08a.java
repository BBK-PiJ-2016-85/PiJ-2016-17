import java.util.Arrays;
import java.util.List;

/**
 * Produce a single String that is the result of concatenating the uppercase versions of all of the Strings.
 * E.g., the result should be "HIHELLO...". Use a single reduce operation, without using map.
 */
public class Ex08a {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    System.out.println("Original words: " + words);

    String upperCaseWords =
      words.stream().reduce("", (s1, s2) -> s1.toUpperCase()
                                              + s2.toUpperCase());
    System.out.println("Single uppercase String: " + upperCaseWords);
  }
}
