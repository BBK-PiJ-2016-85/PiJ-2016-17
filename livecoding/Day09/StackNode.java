public class StackNode<T extends Number> {

   private T myValue;

   private StackNode<T> next;

   public StackNode(T newValue) {
       this.myValue = newValue;
       this.next = null;
   }

   public T getValue() {
       return myValue;
   }

   public void setNext(StackNode<T> node) {
       this.next = node;
   }

   public StackNode<T> getNext() {
       return next;
   }

}