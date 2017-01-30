package examples;

public class Attempt4 {
  public static void main(String[] args) {
    try {
      System.out.println("Before try block");
      try {
        System.out.println("In try block");
        throw new Exception("Exception 1");
      } catch (Exception ex) {
        System.out.println("Caught an exception: " + ex);
        if (true) throw new Exception("Exception 2");
      } finally {
        System.out.println("In finally block");
        throw new Exception("Exception 3");
      }
//      if (true) System.out.println("After try block");
    } catch (Exception ex){
      System.out.println("Caught an outer exception: " + ex);
    }
  }
}
