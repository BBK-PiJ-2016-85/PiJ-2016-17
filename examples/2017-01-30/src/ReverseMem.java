package samples.recursion;

import static samples.recursion.Reverse.reverse;

public class ReverseMem {
  public static void main(String[] args) {
    System.out.println(reverseMemory("JabberWocky", 6, 5));

  }

  public static String reverseMemory(String s, int lenA, int lenB) {
    String one = reverse(s.substring(0, lenA), lenA);
    String two = reverse(s.substring(lenA), lenB);
    return reverse(one + two, one.length() + two.length());
  }
}
