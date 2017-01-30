import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Launcher {

  public static void main(String[] args) {
      List<Integer> numberList = new LinkedList<>();
      for (int i = 0; i < args.length; i++) {
          numberList.add(Integer.parseInt(args[i]));
      }
      Sorter<Integer> sorter = new MergeSorter();
      numberList = sorter.sort(numberList);
      for (int i = 0; i < numberList.size(); i++) {
          System.out.print(" " + numberList.get(i));
      }      
  }

}