import java.util.Arrays;
import java.util.List;

/**
 * Produce a String that is all the words concatenated together, but with commas in between.
 * E.g., the result should be "hi,hello,...". Note that there is no comma at the beginning,
 * before “hi”, and also no comma at the end, after the last word.
 */
public class Ex08c {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
    String wordsWithCommas =
      words.stream().reduce((s1, s2) -> s1 + "," + s2)
        .orElse("need at least two strings");
    System.out.println("Comma-separated String: " + wordsWithCommas);
  }
}
