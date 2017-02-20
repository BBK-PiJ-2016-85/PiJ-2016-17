import java.util.Random;

public class Interrupt {
    
    static Thread mCounter = null;
    static Thread mInterrupter = null;

    /**
     * Create a Counter and an Interrupter thread and start
     * the Counter thread. This in turn will start the Interrupter.
     */
    public static void main(String[] args) {
        mCounter = new Counter();
        mInterrupter = new Interrupter();
        
        mCounter.start();
    }
    
    /**
     * This class implements a Thread which counts backwards
     * from 100 and restarts its count whenever it is interrupted
     * 
     * When this thread completes its countdown to 1 it terminates.
     *
     */
    private static class Counter extends Thread {
        private static final int STARTING_COUNT = 100;
        private int mCount = STARTING_COUNT;        
        
        public void run() {
            mInterrupter.start();
            
            while (mCount > 0) {
                System.out.print("Count: ");
                System.out.println(mCount--);

                if (interrupted())
                    mCount = STARTING_COUNT;

                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    mCount = STARTING_COUNT;
                    System.out.println("RESET");
                }
            }
        }
    }
    
    /**
     * This thread interrupts the Counter thread at random intervals.
     * It checks to make sure that the corresponding Counter is still
     * alive, and terminates as soon as it detects that that thread
     * has died.
     * 
     * @author dom
     *
     */
    private static class Interrupter extends Thread {
        private Random mGenerator = new Random();
        
        public void run() {
            while (mCounter.isAlive()) {
                try {
                    sleep(Math.abs(mGenerator.nextLong()) % 6000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                mCounter.interrupt();
            } 
        }
    }
}