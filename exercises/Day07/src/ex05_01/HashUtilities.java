package ex05_01;

public class HashUtilities {

    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

}
