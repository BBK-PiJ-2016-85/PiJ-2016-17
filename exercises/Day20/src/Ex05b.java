import java.util.Arrays;
import java.util.List;

/**
 * the point here is to use a method reference.
 */
public class Ex05b {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

    System.out.println("Words (no spaces):");
    words.stream().forEach(System.out::println);
  }
}
