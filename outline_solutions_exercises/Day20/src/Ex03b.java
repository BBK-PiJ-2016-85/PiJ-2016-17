import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * You could use two maps to iterate on the two lists and generate the pairs.
 * But this would return a Stream<Stream<Integer[]>>.
 * What you need to do is flatten the generated streams to result in a Stream<Integer[]>.
 * This is what flatMap is for:
 */
public class Ex03b {
  public static void main(String[] args) {
    List<Integer> numbers1 = Arrays.asList(1, 2, 3);
    List<Integer> numbers2 = Arrays.asList(3, 4);
    List<int[]> pairs =
      numbers1.stream()
        .flatMap(i -> numbers2.stream()
                        .map(j -> new int[]{i, j})
        )
        .collect(toList());
    System.out.println(pairs);
  }
}
