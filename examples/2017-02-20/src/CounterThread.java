/**
 * A simple counter class. Here a counter is continually
 * incremented and its value is printed to the terminal at
 * each step. The delay between increments is determined
 * randomly and the whole thing is implemented as a Thread
 * class, so that we can run more than one counter at a time.
 * 
 * @author dom
 *
 */
import java.util.Random;

public class CounterThread extends Thread {

    private int mCount;
    private String mName;
    
    public CounterThread(String pName) {
        mName = pName;
        mCount = 0;
    }

    /**
     * The thread body. In this case it just delegates to the 
     * doCounting() method.
     */ 
    public void run() {
        doCounting();
    }

    /**
     * Our counter method, called from the run() method.
     */
    private void doCounting() {
        Random vGenerator = new Random();
        
        while (true) {
            System.out.print(mName);
            System.out.print(": ");
            System.out.println(mCount++);
            
            try {
                Thread.sleep(Math.abs(vGenerator.nextLong()) % 1000);
            } catch (InterruptedException e) { }
        }
    }
}