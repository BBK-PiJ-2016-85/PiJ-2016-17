package samples.recursion;

public class Exponent {
  public static void main(String[] args) {
    System.out.println(exponentiate(3, 2));
    System.out.println(exponentiate(-2, 2));
  }

  static int exponentiate(int x, int n) {
    if (n == 0)
      return 1;
    return x * exponentiate(x, n - 1);
  }

}
