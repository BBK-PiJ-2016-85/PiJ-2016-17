public class TreeSet<T extends Comparable<T>> implements Set<T> {

   private T value;

   private TreeSet<T> left;
   private TreeSet<T> right;

   public TreeSet(T newValue) {
      this.value = newValue;
      this.left  = null;
      this.right = null;
   }

   public void add(T element) {
       if (value.equals(element)) {
          return;
       }
       // Case A: smaller element
       if (element.compareTo(this.value) < 0) {
          if (left == null) {
             left = new TreeSet<T>(element);
          } else {
             left.add(element); 
          }
          return;
       } 
       // Case B: bigger element
       if (right == null) {
          right = new TreeSet<T>(element);
       } else {
          right.add(element);
       }
   }

   private T getValue() {
       return this.value;
   }

   public boolean contains(T element) {
       if (this.value.equals(element)) {
           return true;
       }
       if (element.compareTo(value) < 0) {
           if (left == null) {
               return false;
           } else {
               return left.contains(element);
           }
       }
       if (right == null) {
          return false;
       } else {
          return right.contains(element);
       }
   }

   public int size() {
      int result = 1;
      if (left != null) {
          result = result + left.size();
      }
      if (right != null) {
          result = result + right.size();
      }
      return result;
   }

   public String toString() {
       String myValue = this.value.toString();
       
       String leftTree = "";
       String rightTree = "";
       if (left != null) {
          leftTree = this.left.toString();
       }
       if (right != null) {
           rightTree = this.right.toString();
       }
       return leftTree + " " + myValue + " " + rightTree;
   }

}