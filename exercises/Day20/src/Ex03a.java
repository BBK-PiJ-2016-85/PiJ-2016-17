import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Ex03a {
  public static void main(String[] args) {
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

    List<Integer> result =
    numbers1.stream().map((x) -> x * x).collect(toList());

    System.out.println(result);
  }
}
