import javaslang.Tuple;
import javaslang.Tuple2;

public class ExampleFour {
  public static void main(String[] args) {
    // = (1, "A")
    Tuple2<Integer, String> entry = Tuple.of(1, "A");

    System.out.println(entry);

    Integer key = entry._1;
    String value = entry._2;

    System.out.println(key);
    System.out.println(value);
  }
}
