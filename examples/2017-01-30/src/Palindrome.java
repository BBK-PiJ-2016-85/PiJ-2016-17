package samples.recursion;

public class Palindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome("Madam, I'm Adam"));
    System.out.println(isPalindrome("fred"));
    System.out.println(isPalindrome("12321"));
  }

  static boolean isPalindrome(String s) {
    String str = s.toLowerCase().replaceAll("\\W", "");
    return palindromeHelper(str);
  }

  static boolean palindromeHelper(String s) {
    if (s.length() <= 1)
      return true;
    int length = s.length() - 1;
    return (s.charAt(0) == s.charAt(length))
               && isPalindrome(s.substring(1, length));
  }
}
