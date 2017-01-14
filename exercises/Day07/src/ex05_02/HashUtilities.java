package ex05_02;

public class HashUtilities {

    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

}
