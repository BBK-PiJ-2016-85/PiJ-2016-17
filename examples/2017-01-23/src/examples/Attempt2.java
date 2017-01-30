package examples;

public class Attempt2 {
  public static void main(String[] args) {
    String s = null;
    if (s != null) {
      System.out.println(s.length());
    } else {
      System.out.println("No string specified");
    }
  }
}
