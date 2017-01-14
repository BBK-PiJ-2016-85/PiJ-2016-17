package ex03;

public class Launcher {
  public static void main(String[] args) {
    int[] fixedArray = new int[3];
    fixedArray[0] = 1;
    fixedArray[1] = 2;
    fixedArray[2] = 3;

    int[] variableArray = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      variableArray[i] = Integer.parseInt(args[i]);
    }

    ArrayCopier myCopier = new ArrayCopier();
    myCopier.copy(fixedArray, variableArray);

    for (int j = 0; j < args.length; j++) {
      System.out.print(variableArray[j] + " ");
    }
    System.out.println();
  }
}
