public class Ex06 {
  public static void main(String[] args) {
    System.out.println(gcd(12,15));
    System.out.println(gcd(12,6));
    System.out.println(gcd(14,27));
  }

  private static int gcd(int p, int q) {
    if (q == 0)
      return p;
    else
      return gcd(q, p % q);
  }
}
