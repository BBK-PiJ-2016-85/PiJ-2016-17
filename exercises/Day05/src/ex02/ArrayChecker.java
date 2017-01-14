package ex02;

public class ArrayChecker {

  public boolean isSymmetrical(int[] theArray) {
      int size = theArray.length;
      for (int i = 0; i < size / 2; i++) {
          if (theArray[i] != theArray[size - i - 1]) {
              return false;
          }
      }
      return true;
  }

  public int[] reverse(int[] theArray) {
      int size = theArray.length;
      int[] result = new int[size];
      for (int i = 0; i < size; i++) {
          result[size - i - 1] = theArray[i];
      }
      return result;
  }

  public int[] checkAndReverse(int[] theArray) {
    ArrayChecker myChecker = new ArrayChecker();
    if (!myChecker.isSymmetrical(theArray)) {
        int[] reversedArray = myChecker.reverse(theArray);
        return reversedArray;
     } else {
        return theArray;
     }
  }

  public void printArray(int[] theArray) {
    for (int i = 0; i < theArray.length; i++) {
        System.out.print(theArray[i]);
    }
    System.out.println("");
  }


}
