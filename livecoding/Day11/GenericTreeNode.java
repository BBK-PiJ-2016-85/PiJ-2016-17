public class GenericTreeNode<T extends Comparable<T>> implements Set<T> {

   private T value;
   private GenericTreeNode<T> left;
   private GenericTreeNode<T> right;

   public boolean contains(T value) {
      // if (this.value.compareTo(value) == 0) {
      if (this.value.equals(value)) {
         return true;
      }
      if (value.compareTo(this.value) > 0) {
          if (right != null) {
              return right.contains(value);
          }
          return false;
      } else {
          if (left == null) {
              return false;
          }
          return left.contains(value);
      }
   }

   public int getDepth() {
      if (left == null && right == null) {
          return 0;
      }

      int leftDepth = 0;
      if (left != null) {
          leftDepth = left.getDepth();
      }      

      int rightDepth = 0;
      if (right != null) {
          rightDepth = right.getDepth();
      }      

      int result = 1 + Math.max(leftDepth, rightDepth);
      return result;
   }

   public void add(T newValue) {
       if (newValue.compareTo(this.value) > 0) {
           if (right == null) {
               right = new GenericTreeNode<T>(newValue);
           } else {
               right.add(newValue);
           }
       } else {
           if (left == null) {
               left = new GenericTreeNode<T>(newValue);
           } else {
               left.add(newValue);
           }
       }
   }

   public GenericTreeNode(T value) {
      this.value = value;
   }

}















