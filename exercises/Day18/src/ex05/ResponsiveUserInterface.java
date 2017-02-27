package ex05;

import java.util.ArrayList;
import java.util.List;

public class ResponsiveUserInterface {
  private static final int NUMBEROFTASKS = 10;

  private List<Integer> finishedTasks = new ArrayList<>();

  private int activeTaskCount = 0;

  public static void main(String[] args) {
    ResponsiveUserInterface ui = new ResponsiveUserInterface();
    ui.launch();
  }

  private void launch() {
    for (int i = 0; i < NUMBEROFTASKS; i++) {
      reportOnFinishedTasks();
      System.out.print("Enter the duration (in ms) of task " + i + ": ");
      int duration = Integer.parseInt(System.console().readLine());
      
      Runnable task = new Waiter(i, duration, this);
      Thread t = new Thread(task);
      t.start();                    // equiv. to => (new Thread(task)).start();
      activeTaskCount++;
    }
    
    while (!allTasksFinished()) {
      waitForAWhile();
    }
    
    reportOnFinishedTasks();
  }

  private synchronized void waitForAWhile() {
    try {
      wait();
    } catch (InterruptedException ex) {
      ex.printStackTrace();
      // we do not wait as much, fine
    }
  }

  public boolean allTasksFinished() {
    return activeTaskCount == 0;
  }

  public synchronized void reportFinished(int id) {
    finishedTasks.add(id);
    activeTaskCount--;
    notifyAll();
  }

  private synchronized void reportOnFinishedTasks() {
    if (finishedTasks.size() == 0) {
      System.out.println("There are no finished tasks");
      return;
    }
    System.out.print("Finished tasks: ");
    for (Integer n : finishedTasks) {
      System.out.print(n + ", ");
    }
    System.out.println();
    finishedTasks = new ArrayList<>();
  }
}
