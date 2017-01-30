package ex04;

public class BinarySearchRecursive {


    // need extra "helper" method, feed in params
    public boolean binarySearch(int[] a, int x) {
        if (a.length == 0) return false;
        return binarySearch(a, x, 0, a.length - 1);
    }

    // need extra low and high parameters
    private boolean binarySearch(int[] a, int x,
                                 int low, int high) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (a[mid] == x) return true;
        else if (a[mid] < x)
            return binarySearch(a, x, mid + 1, high);
        else // last possibility: a[mid] > x
            return binarySearch(a, x, low, mid - 1);
    }
}
