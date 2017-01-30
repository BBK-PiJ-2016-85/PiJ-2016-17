public class TreeNode<T extends Comparable<T>> {

  private T value;

  public void add(T value) {
     if (value.compareTo(this.value) > 0) {

     } 
     if (thisValueIsGreaterThan(value)) {

     }
  }

  private boolean thisValueIsGreaterThan(T value) {
    return (value.compareTo(this.value) > 0);
  }
}