import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * You saw earlier that filter can be used with a predicate to filter elements from a stream.
 * Because after the flatMap operation you have a stream of int[] that represent a pair,
 * you just need a predicate to check to see if the sum is divisible by 3:
 */
public class Ex04 {
  public static void main(String[] args) {
    List<Integer> numbers1 = Arrays.asList(1, 2, 3);
    List<Integer> numbers2 = Arrays.asList(3, 4);
    List<int[]> pairs =
      numbers1.stream()
        .flatMap(i ->
                   numbers2.stream()
                     .filter(j -> (i + j) % 3 == 0)
                     .map(j -> new int[]{i, j})
        )
        .collect(toList());

    System.out.println(pairs);
  }
}
