package examples;


public class GoesWrong {
  public static void main(String[] args) {
    try {
      System.out.println("Before");
      System.out.println(3 / 0);
      System.out.println("After");
    } catch (Exception ex) {
      System.err.println("Ouch");
      throw new RuntimeException();
    } finally {
      System.err.println("Something else");
    }
  }
}
