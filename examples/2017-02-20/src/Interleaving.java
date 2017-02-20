public class Interleaving {
    /**
     * Main method, starts two counter threads and then retires.
     */
    public static void main(String[] args) {
        new CounterThread("First Thread").start();
        new CounterThread("Second Thread").start();
    }
}  
