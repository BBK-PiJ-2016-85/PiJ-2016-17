/**
 * An interface for which lambdas can be used. See StringUtils for
 * examples of USING this interface in code, which are more or less the same
 * as in Java 7. But, see IsBetterExamples for examples of PASSING IN
 * instances of this interface, where now in Java 8 you can use lambdas.
 * Also see TwoStringPredicate for a weaker version of this interface
 * that works only for Strings.
 */
@FunctionalInterface
interface TwoElementPredicate<T> {
  /**
   * Returns true if the first entry is "better" than the second one,
   * returns false otherwise. Concrete classes (or lambdas) that implement
   * this interface give meaning to their definition of "better".
   */
  boolean isBetter(T element1, T element2);
}


public class Ex04 {
  public static void main(String[] args) {
    String test1 = "Hello";
    String test2 = "Goodbye";
    String message = "Better of %s and %s based on %s is %s.%n";
    String result1 = betterElement(test1, test2, (s1, s2) -> s1.length() > s2.length());
    System.out.printf(message, test1, test2, "length", result1);
    String result2 = betterElement(test1, test2, (s1, s2) -> true);
    System.out.printf(message, test1, test2, "1st arg", result2);
  }

  private static String betterElement(String s1, String s2, TwoStringPredicate tsp) {
    if (tsp.isBetter(s1, s2)) {
      return (s1);
    } else {
      return (s2);
    }

  }
}
