import static javaslang.API.*;

public class Example {
  String stringify(int n) {
    return Match(n).of(
      Case(0, "zero"),
      Case(1, "one"),
      Case($(i -> i > 1), "many"),
      Case($(), "negative")
    );
  }

  public static void main(String[] args) {
    Example ex = new Example();
    System.out.println(ex.stringify(10));
    System.out.println(ex.stringify(-1));
  }
}
