import java.util.Arrays;
import java.util.List;

/**
 * Produce the same String as above, but this time via a map operation that turns the words into upper case,
 * followed by a reduce operation that concatenates them.
 */
public class Ex08b {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    System.out.println("Original words: " + words);

    String upperCaseWords2 =
      words.stream().map(String::toUpperCase)     // Or .map (s -> s.toUpperCase())
        .reduce("", String::concat);  // Or .reduce("", (s1,s2) -> s1+s2)
    System.out.println("Single uppercase String: " + upperCaseWords2);
  }
}
