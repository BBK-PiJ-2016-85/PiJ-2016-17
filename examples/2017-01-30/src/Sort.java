package samples.recursion;

public class Sort {
  public static void main(String[] args) {
    int[] intArr = {3, 5, 2, 1};
    permutationsort(intArr, intArr.length);
  }

  static boolean sort(int[] arr, int n, int i) {
    boolean flag;

		/* Check to see if list is sorted */
    flag = true;
    for (int j = 0; j < n - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        flag = false;
        break;
      }
    }
    if (flag)
      return true;

		/* Compute each permutation recursively */
    for (int j = i + 1; j < n; j++) {
      int swap = arr[i];
      arr[i] = arr[j];
      arr[j] = swap;

      if (sort(arr, n, i + 1))
        return true;

      swap = arr[i];
      arr[i] = arr[j];
      arr[j] = swap;
    }

    return false;
  }

  static void permutationsort(int[] arr, int n) {
    String str = "nuts!";
    if (sort(arr, n, 0)) str = "succeeded";
    System.out.println(str);
  }
}
