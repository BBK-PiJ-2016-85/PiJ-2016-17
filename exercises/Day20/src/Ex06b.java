import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * For the following lists produce the same transformations using filter (you wrote solutions for last exercise sheet)
 */
public class Ex06b {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    List<String> shortWords = words.stream()
                                .filter(s -> s.length() < 4)
                                .collect(Collectors.toList());
    System.out.printf("Short words: %s.%n", shortWords);
    List<String> wordsWithB = words.stream()
                                .filter(s -> s.contains("b"))
                                .collect(Collectors.toList());
    System.out.printf("B words: %s.%n", wordsWithB);
    List<String> evenLengthWords = words.stream()
                                     .filter(s -> (s.length() % 2) == 0)
                                     .collect(Collectors.toList());
    System.out.printf("Even-length words: %s.%n", evenLengthWords);
  }
}
