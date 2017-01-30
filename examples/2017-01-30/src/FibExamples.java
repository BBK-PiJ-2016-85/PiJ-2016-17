import java.util.HashMap;
import java.util.Map;
import java.time.Duration;
import java.time.Instant;

public class FibExamples {

    public static void main(String[] args) {
        final int n=40;
        
        Instant start = Instant.now();
        System.out.println(FibonacciIterative(n));
        Instant end = Instant.now();
        System.out.println("Timing: " + Duration.between(start, end).toNanos());

        start = Instant.now();
        System.out.println(FibonacciRecursive(n));
        end = Instant.now();
        System.out.println("Timing: " + Duration.between(start, end).toNanos());
        

        start = Instant.now();
        System.out.println(FibonacciRecursiveMemoized(n));
        end = Instant.now();
        System.out.println("Timing: " + Duration.between(start, end).toNanos());
    }

    //--------------- iterative version ---------------------
    public static long FibonacciIterative(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prevPrev = 0;
        long prev = 1;
        long result = 0;

        for (long i = 2; i <= n; i++) {
            result = prev + prevPrev;
            prevPrev = prev;
            prev = result;
        }
        return result;
    }

    //--------------- naive recursive version ---------------------
    public static long FibonacciRecursive(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
    }

    //--------------- memoized recursive version ---------------------
    static Map<Long,Long> resultHistory = new HashMap<>();

    static long FibonacciRecursiveMemoized(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (resultHistory.containsKey(n))
            return resultHistory.get(n);

        long result = FibonacciRecursiveMemoized(n - 1) + FibonacciRecursiveMemoized(n - 2);
        resultHistory.put(n, result);

        return result;
    }
}
