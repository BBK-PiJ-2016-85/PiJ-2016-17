import javaslang.collection.List;
import javaslang.collection.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExampleThree {
  public static void main(String[] args) {
    // = ["1", "2", "3"] in Java 8
    Arrays.asList(1, 2, 3)
      .stream()
      .map(Object::toString)
      .collect(Collectors.toList());

    Stream.of(1, 2, 3).map(Object::toString);

    String[] words = {"abc", "bcd", "efg"};
    System.out.println(List.of(words).mkString(", "));
  }

  String join(String... words) {
    StringBuilder builder = new StringBuilder();
    for (String s : words) {
      if (builder.length() > 0) {
        builder.append(", ");
      }
      builder.append(s);
    }
    return builder.toString();
  }

  String join2(String... words) {
    return List.of(words)
             .intersperse(", ")
             .fold("", String::concat);
  }
}
