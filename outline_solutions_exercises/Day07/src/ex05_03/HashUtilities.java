package ex05_03;

public class HashUtilities {

    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

    public static int veryShortHash(int input) {
        return Math.abs(input % 10);
    }


}
