package examples;

public class Attempt3 {
  public static void main(String[] args) {
    String s = null;
    try {
      System.out.println(s.length());
    } catch (NullPointerException ex){
      System.out.println("No string specified");
      System.out.println(ex);
    }
  }
}
