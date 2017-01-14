import java.util.Arrays;
import java.util.List;

public class Ex04 {

  public static void main(String[] args) {

    List<String> words = Arrays.asList("a", "hi", "abba", "qwerttrewq", "bye", "javaj", "Javaj");
    for (String str : words) {
      isPalindrome(str);
      String res = isPalindrome(str) ? "" : "not ";
      System.out.println(str + " is " + res + "a palindrome...  ");
    }
  }

  private static boolean isPalindrome(String str) {
    if (str.length() <= 1) {
      return true;
    } else if (str.charAt(str.length() - 1) == str.charAt(0)) {
      return isPalindrome(str.substring(1, str.length() - 1));
    } else {
      return false;
    }
  }
}
