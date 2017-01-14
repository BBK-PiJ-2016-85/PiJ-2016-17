package ex033alt;

public class ThreadHolder implements Runnable {
  private Thread threadManager;
  private Runnable command;


  public ThreadHolder(Thread tm, Runnable command) {
    threadManager = tm;
    this.command = command;
  }

  @Override
  public void run() {
    command.run();
    //	threadManager.lowerCount();
    notify();
  }
}
