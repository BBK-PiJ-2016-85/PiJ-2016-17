// only the recursive method required for the answer.
// rest of the code for testing and completeness.

package samples.recursion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MathList {
  public static boolean isDigit(Character c) {
    String s = c.toString();
    return s.matches("\\d");
  }

  public static boolean isOperator(Character c) {
    String s = c.toString();
    return s.equals("+") || s.equals("-");
  }

  public static boolean isValid(List<Character> s) {
    boolean result = false;
    // base case: list is empty (or null)
    if (s == null || s.isEmpty()) return result;

    // base case: list of one element
    if (s.size() == 1) {
      result = MathList.isDigit(s.get(0));
    } else {
      Character first = s.get(0);
      Character second = s.get(1);
      if (MathList.isDigit(first) && MathList.isOperator(second)) {
        LinkedList<Character> t = new LinkedList<>(s);
        t.remove();
        t.remove();
        result = MathList.isValid(t);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    // valid
    List<Character> s1 = Arrays.asList('1');
    List<Character> s2 = Arrays.asList('2', '+', '3');
    List<Character> s3 = Arrays.asList('0', '-', '1', '+', '2', '-', '5');
    // invalid
    List<Character> s4 = Arrays.asList();
    List<Character> s5 = Arrays.asList('-');
    List<Character> s6 = Arrays.asList('9', '+', '3', '-');
    List<Character> s7 = Arrays.asList('+', '7', '-');

    System.out.println(MathList.isValid(s1));
    System.out.println(MathList.isValid(s2));
    System.out.println(MathList.isValid(s3));
    System.out.println(MathList.isValid(s4));
    System.out.println(MathList.isValid(s5));
    System.out.println(MathList.isValid(s6));
    System.out.println(MathList.isValid(s7));
  }
}
