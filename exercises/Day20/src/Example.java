import java.util.Arrays;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

    double result =
      numbers1
        .stream()
        //.parallel()
        .map(a -> a * 2.0) // 2.0, 4.0, 6.0, 8.0, 10.0
        .reduce(1.0,(a,b) -> a * b);
    // 1.0 * 2.0 => 2.0
    // 2.0 * 4.0 => 8.0
    // 8.0 * 6.0 => 48.0
    // 48.0 * 8.0 => 384.0
    // 384.0 * 10.0 => 3840.0
    System.out.println(result);
  }
}
