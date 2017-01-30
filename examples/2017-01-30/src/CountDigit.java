package samples.recursion;

public class CountDigit {
  private static int BASE = 10;

  public static void main(String[] args) {
    System.out.println(countDigit(345, 5));
    System.out.println(countDigit(544313525, 5));
    System.out.println(countDigit(2131234, 9));
  }

  static int countDigit(int n, int digit) {
    if (n == 0)
      return 0;

    if (n % BASE == digit)
      return 1 + countDigit(n / BASE, digit);
    else
      return countDigit(n / BASE, digit);
  }

}
