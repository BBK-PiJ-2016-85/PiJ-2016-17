package ex06;
/**
 * This class launched two heavy computations
 * sequentially first, then in parallel. 
 * Assuming there is more than one processor in 
 * the machine, parallel computations finish
 * earlier.
 */
public class ComputationLauncher {   
    /**
     * How many numbers to process? If too low, there is no noticeable
     * difference.
     */
     private static final int COUNT = 40000000;
     private static final int THREADS = Runtime.getRuntime().availableProcessors();

    /*
     * The computations to be performed. Stored as fields so 
     * both methods (sequential and parallel) act on exactly 
     * the same data
     */
    private Computation[] comp = new Computation[THREADS];

    /**
     * The main method that launches the computations
     *
     * @param args command-line arguments, ignored
     */
    public static void main(String args[]) {
      ComputationLauncher c = new ComputationLauncher();
      c.launch();
    }
   
    private double[] createArray(int size) {
      double[] result = new double[size];
      for (int i = 0; i < result.length; i++) {
            result[i] = Math.random();
      }
      return result;
    }
   
    private void launch() {
      // Uncomment the following line to know how many processors your machine has
      System.out.println("#CPU: " + Runtime.getRuntime().availableProcessors());
      long start, stop;
      for (int i=0; i < comp.length; i++){
        comp[i] = new Computation(createArray(COUNT/THREADS));
      }
      
      start = System.currentTimeMillis();
      sequentialComputations(comp);
      stop = System.currentTimeMillis();
      System.out.println("Time without threads: " + (stop - start) + "ms");

      start = System.currentTimeMillis();
      parallelComputations(comp);
      stop = System.currentTimeMillis();
      System.out.println("Time with threads: " + (stop - start) + "ms");
    }
   
    private void sequentialComputations(Computation[] comp) {
      double result = 0;
      for(Computation c: comp){
        c.run();
        result += c.getResult();
      }
      System.out.println("Result: " + result);
    }
   
    private void parallelComputations(Computation[] comp) {
      for (Computation c: comp){
        new Thread(c).start();
      }

      double result = 0;
      for (Computation c: comp){
        result += c.getResult();
      }
      System.out.println("Result: " + result);
    }
}