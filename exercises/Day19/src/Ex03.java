/**
 * An interface for which lambdas can be used. See StringUtils for
 * examples of USING this interface in code, which are more or less the same
 * as in Java 7. But, see IsBetterExamples for examples of PASSING IN
 * instances of this interface, where now in Java 8 you can use lambdas.
 * Also see TwoElementPredicate for a genericized version of this interface.
 */
@FunctionalInterface
interface TwoStringPredicate {
  /**
   * Returns true if the first String is "better" than the second one,
   * returns false otherwise. Concrete classes (or lambdas) that implement
   * this interface give meaning to their definition of "better".
   */
  boolean isBetter(String s1, String s2);
}

public class Ex03 {
  public static void main(String[] args) {
    String test1 = "Hello";
    String test2 = "Goodbye";
    String message = "Better of %s and %s based on %s is %s.%n";
    String result1 = betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
    System.out.printf(message, test1, test2, "length", result1);
    String result2 = betterString(test1, test2, (s1, s2) -> true);
    System.out.printf(message, test1, test2, "1st arg", result2);
  }

  private static String betterString(String s1, String s2, TwoStringPredicate tsp) {
    return (tsp.isBetter(s1, s2)? s1 : s2);
    
    // if (tsp.isBetter(s1, s2)) {
    //   return s1;
    // } else {
    //   return s2;
    // }

  }
}
