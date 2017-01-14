package examples;

public class RunnableExample {
  public final int value = 4;

  public static void main(String... args) {
    RunnableExample m = new RunnableExample();
    m.doIt(); // ???
  }

  public void doIt() {
    int value = 6;
    Runnable r = new Runnable() {
      public final int value = 5;

      public void run() {
        int value = 10;
        System.out.println(this.value);
      }
    };
    r.run();
  }
}
