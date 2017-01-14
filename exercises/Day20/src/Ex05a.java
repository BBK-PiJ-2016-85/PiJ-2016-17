import java.util.Arrays;
import java.util.List;

/**
 * Loop through the words and print each on a separate line, with two spaces in front of each word.
 */
public class Ex05a {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    System.out.println("Words (with spaces):");
    words.stream().forEach(s -> System.out.println("  " + s));

  }
}
