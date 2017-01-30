public class B extends A {


 public void bb() {
    aa();
 }

  private void aa() {
    super.aa();
  }

  public static void main(String[] args) {
    (new B()).bb();
  }
}