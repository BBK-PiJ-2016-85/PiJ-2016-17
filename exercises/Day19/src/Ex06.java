import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex06 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
    System.out.printf("Original words: %s.%n", words);
    List<String> shortWords2 = allMatches(words, s -> s.length() < 4);
    System.out.printf("Short words: %s.%n", shortWords2);
    List<String> wordsWithB2 = allMatches(words, s -> s.contains("b"));
    System.out.printf("B words: %s.%n", wordsWithB2);
    List<String> evenLengthWords2 = allMatches(words, s -> (s.length() % 2) == 0);
    System.out.printf("Even-length words: %s.%n", evenLengthWords2);
  }

  public static <T> List<T> allMatches(List<T> candidates,
                                       Predicate<T> matchFunction) {
    List<T> results = new ArrayList<>();
    for (T possibleMatch : candidates) {
      if (matchFunction.test(possibleMatch)) {
        results.add(possibleMatch);
      }
    }
    return results;
  }
}
