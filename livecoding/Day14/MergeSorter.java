import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class MergeSorter implements Sorter<Integer> {

   public List<Integer> sort(List<Integer> list) {
       int size = list.size();
       // 1. Get the subproblems
       if (size < 2) {
           return list;
       }
       List<Integer> firstHalf = getSubList(list, 0, size/2);
       List<Integer> secondHalf = getSubList(list, size/2, size);
       List<Integer> firstSorted = sort(firstHalf);
       List<Integer> secondSorted = sort(secondHalf);
       // 2. Integrate the sub-solutions
       List<Integer> result = new ArrayList<>();
       boolean finished = false;
       int firstIdx = 0;
       int secondIdx = 0;
       while (!finished) {
          if (firstIdx == firstSorted.size()) {
              break;
          }
          if (secondIdx == secondSorted.size()) {
              break;
          }
          int firstElement = firstSorted.get(firstIdx);
          int secondElement = secondSorted.get(secondIdx);
          if (firstElement < secondElement) {
              result.add(firstElement);
              firstIdx++;
          } else {
              result.add(secondElement);
              secondIdx++;
          }
       }
       if (firstIdx != firstSorted.size()) {
           for (int i = firstIdx; i < firstSorted.size(); i++) {
               result.add(firstSorted.get(i));
           }
       }
       if (secondIdx != secondSorted.size()) {
           for (int i = secondIdx; i < secondSorted.size(); i++) {
               result.add(secondSorted.get(i));
           }
       }
       return result;
   }

   private List<Integer> getSubList(List<Integer> list, int start, int end) {
       List<Integer> result = new LinkedList<>();
       for (int i = start; i < end; i++) {
          result.add(list.get(i));
       }
       return result;
   }
}