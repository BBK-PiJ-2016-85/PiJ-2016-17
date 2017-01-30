package examples;

public class Attempt {
  public static void main(String[] args) {
    try {
      throw new Exception("An exception"); // checked
    } catch (Exception e) {
      e.printStackTrace();
    }
    //throw new RuntimeException("A runtime exceptione"); // unchecked
  }
}
