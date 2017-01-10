public class Ex02b {

  public static void main(String[] args) {
    int get = 45;
    Ex02b ex = new Ex02b();
    System.out.println(ex.fib(get));
  }

//fib 1: 1
//fib 2: 1
//fib 3: fib 2 + fib 1 = 2
//fib 4: fib 3 + fib 2 = 3
//fib 5: fib 4 + fib 3 = 5

//etc..

  int fib(int n) {
    if (n < 3) {
      return 1;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }
}
