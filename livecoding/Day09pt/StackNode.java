public class StackNode<T> {

   private T value;

   private StackNode<T> next;

   public StackNode(T value) {
       this.value = value;
   }

   public void setNext(StackNode<T> nextNode) {
       this.next = nextNode;
   }

   public T getValue() {
       return this.value;
   }

   public StackNode<T> getNext() {
       return next;
   }

   public boolean isAtTheBottom() {
       return (next == null);
   }

}