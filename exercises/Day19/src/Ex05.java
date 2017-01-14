import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex05 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    System.out.println(words);
    List<String> shortWords = allMatches(words, s -> s.length() < 4);
    System.out.println(shortWords);
    List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
    System.out.println(wordsWithB);
    List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
    System.out.println(evenLengthWords);
  }

  public static List<String> allMatches(List<String> candidates,
                                        Predicate<String> matchFunction) {
    List<String> results = new ArrayList<>();
    for (String possibleMatch : candidates) {
      if (matchFunction.test(possibleMatch)) {
        results.add(possibleMatch);
      }
    }
    return (results);
  }
}
