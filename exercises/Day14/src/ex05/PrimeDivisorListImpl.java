package ex05;

import java.util.*;

public class PrimeDivisorListImpl implements PrimeDivisorList {

    // The list of prime divisors
    private List<Integer> list = new ArrayList<>();
    // The number to find the prime divisors of
    private Integer numberToFindPrimes;
    // A map to hold the occurrences
    private Map<Integer, Integer> map = new HashMap<>();

    public PrimeDivisorListImpl(Integer x) {
        numberToFindPrimes = x;
        findPrimeDivisorList(numberToFindPrimes);
    }

    /**
     * Finds the divisors of a number that are prime.
     * Does not check if the number can be made up only of primes.
     *
     * @param x The number to find the prime divisors of.
     */
    void findPrimeDivisorList(Integer x) {
        int number = x;
        while (number > 1 && x > 1) {
            if (isPrime(number))  // candidate value
                if (x % number == 0) { // prime divisor
                    add(number); // add to list
                    x /= number; // reduce number
                } else {
                    number--;
                }
            else {
                number--;
            }
        }
    }


    @Override
    public void add(Integer i) throws NullPointerException, IllegalArgumentException {
        if (i == null) {
            throw new NullPointerException("No Null values allowed in this list");
        }
        if (!isPrime(i)) {
            throw new IllegalArgumentException("No non-primes allowed in this list");
        }
        list.add(i);
    }

    @Override
    public Integer remove(Integer x) throws IllegalArgumentException {
        if (!list.remove(x))
            throw new IllegalArgumentException("The integer " + x + "cannot be removed from the list");
        return x;
    }

    @Override
    public String toString() {
        if (list.isEmpty()) return "The list is empty";

        StringBuilder sb = new StringBuilder("[");
        for (Integer value : list) {
            if (map.containsKey(value)) {
                int count = map.get(value);
                map.replace(value, ++count);
            } else {
                map.put(value, 1);
            }
        }
        Object[] intArray = map.keySet().toArray();
        for (int i=0; i < intArray.length; i++) {
            Integer value = (Integer) intArray[i];
            sb.append(" " + value);
            if (map.get(value) > 1)
                sb.append("^" + map.get(value));
            if (i < intArray.length-1) sb.append(" *");
        }
        sb.append(" ] = " + numberToFindPrimes);
        return sb.toString();
    }

    private boolean isPrime(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
