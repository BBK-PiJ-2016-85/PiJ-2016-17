import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex07 {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
    System.out.println(words);

    List<String> excitingWords =
      transformedList(words, s -> s + "!");
    System.out.println(excitingWords);

    List<String> eyeWords =
      transformedList(words, s -> s.replace("i", "eye"));
    System.out.println(eyeWords);

    List<String> upperCaseWords =
      transformedList(words, String::toUpperCase);
    System.out.println(upperCaseWords);
  }

  public static List<String> transformedList(List<String> originals,
                                             Function<String, String> transformer) {
    List<String> results = new ArrayList<>();
    for (String original : originals) {
      results.add(transformer.apply(original));
    }
    return (results);
  }

}
