public class Ex02a {
  public static void main(String[] args) {

    Ex02a ex = new Ex02a();
    int n = 8;
    System.out.println(ex.factorial(n));

    if (n == 1) {
      System.out.println(1);
    } else {
      int x = 2;
      int t = 1;
      while (x <= n) {
        t = t * x;
        x++;
      }
      System.out.println(t);
    }
  }


  int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
