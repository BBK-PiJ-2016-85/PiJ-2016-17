package samples.recursion;

public class Reverse {
  public static void main(String[] args) {
    System.out.println(reverse("abcdef", 6));
  }

  public static String reverse(String s, int len) {
    if (len > 0) {
      return reverse(s.substring(1), --len) + s.charAt(0);
    }
    return "";
  }
}
