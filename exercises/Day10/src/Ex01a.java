public class Ex01a {

  public static void main(String[] args) {
    Ex01a ex = new Ex01a();
    ex.printNumbers(6);
  }

  void printNumbers(int n) {
    if (n <= 0) {
      return;
    }

    System.out.println(n);
    printNumbers(n - 2);
    printNumbers(n - 3);
    System.out.println(n);
  }
}
