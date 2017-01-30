package samples.recursion;

public class Fib {

  public static void main(String[] args) {
    System.out.println(fibN(6, 2)); // 0,1,1,...
    System.out.println(fibN(6, 3));
  }

  static int fibN(int num, int terms) { /* terms is the N */
    int total = 0;
    if (num <= 1)
      return 1;
    else {
      for (int i = 1; i <= terms; i++)
        total += fibN(num - i, terms);
      return total;
    }
  }
}
