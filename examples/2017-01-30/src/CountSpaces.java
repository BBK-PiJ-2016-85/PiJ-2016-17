package samples.recursion;

public class CountSpaces {
  public static void main(String[] args) {
    System.out.println(countspaces("a number of spaces "));
  }

  public static int countspaces(String s) {
    if (s.length() == 0)
      return 0;
    else
      return (s.charAt(0) == ' ' ? 1 : 0) + countspaces(s.substring(1));
  }
}
