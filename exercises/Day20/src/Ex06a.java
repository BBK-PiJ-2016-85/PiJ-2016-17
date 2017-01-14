import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * For the following expressions, which you wrote for the last exercise sheet,
 * produce the same transformations using map
 */
public class Ex06a {
  public static void main(String[] args) {
    List<String> words =
      Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    List<String> excitingWords = words.stream()
                                   .map(s -> s + "!")
                                   .collect(Collectors.toList());
    System.out.printf("Exciting words: %s.%n", excitingWords);
    List<String> eyeWords = words.stream()
                              .map(s -> s.replace("i", "eye"))
                              .collect(Collectors.toList());
    System.out.printf("Eye words: %s.%n", eyeWords);
    List<String> upperCaseWords = words.stream()
                                    .map(String::toUpperCase)  // or  .map(s -> s.toUpperCase())
                                    .collect(Collectors.toList());
    System.out.printf("Uppercase words: %s.%n", upperCaseWords);

  }
}
