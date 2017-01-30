package samples.recursion;

public class Replace {
  public static void main(String[] args) {
    System.out.println(replace("steve", 'e', 'a'));
  }

  static String replace(String s, char from, char to) {
    if (s.length() != 0) {
      char temp = s.charAt(0);
      if (temp == from)
        temp = to;
      return "" + temp + replace(s.substring(1), from, to);
    }
    return "";
  }
}
