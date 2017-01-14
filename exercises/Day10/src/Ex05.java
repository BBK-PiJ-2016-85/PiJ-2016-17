public class Ex05 {
  public static void main(String[] args) {

    int base = 10;
    int exponent = 5;
    System.out.println(base + " to the power of " + exponent + " = " + pow(base, exponent));

    // iteratively

    int result = 1;
    for (int i = 1; i <= exponent; i++) {
      result = result * base;
    }

    System.out.println("Iteratively we also get: " + result);
  }

  private static int pow(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      return base * pow(base, exponent - 1);
    }
  }
}
