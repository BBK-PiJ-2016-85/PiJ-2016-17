import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * The above example uses lazy evaluation, but it is not easy to see that it is doing so.
 * Make a variation of the previous example that proves that it is doing lazy evaluation.
 * The simplest way is to track which entries are turned into upper case.
 */
public class Ex07b {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    Function<String, String> toUpper =
      s -> {
        System.out.println("Uppercasing " + s);
        return (s.toUpperCase());
      };
    String result = words.stream()
                      .map(toUpper)
                      .filter(s -> s.length() < 4)
                      .filter(s -> s.contains("E"))
                      .findFirst().orElse("No match");
    System.out.println("Uppercase short word with 'E': " + result);
  }
}
