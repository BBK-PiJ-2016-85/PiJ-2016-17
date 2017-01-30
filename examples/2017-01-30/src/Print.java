package samples.recursion;

import static java.lang.Math.abs;

public class Print {
  private static final int NEWLINE = (int) '\n';
  private static final int ZERO = (int) '0';

  public static void main(String[] args) {
    printInt(987);
    printInt(10001);
    printInt(-22);
    printBase(22, 2);
    System.out.write(NEWLINE);
    printBase(27, 9);
    System.out.write(NEWLINE);
  }

  static void printInt(int num) {
    printBase(num, 10);
    System.out.write(NEWLINE);
  }

  static void printBase(int num, int base) {
    if (num < 0) {
      System.out.write((int) '-');
      num = abs(num);
    }

    int value = num / base;
    if (value > 0)
      printBase(value, base);
    System.out.write(ZERO + (num % base));
  }

}
