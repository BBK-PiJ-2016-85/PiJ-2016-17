public class StackImpl<T extends Number> implements Stack<T> {

   private StackNode<T> head = null;

   public void push(T newValue) {
       StackNode<T> newNode = new StackNode<T>(newValue);
       if (isEmpty()) {
           head = newNode;
           return;
       }
       newNode.setNext(head);
       head = newNode;
   }

   public T pop() {
      if (isEmpty()) {
           return null;
      }
      T result = head.getValue();
      head = head.getNext();
      return result;
   }

   public boolean isEmpty() {
      if (head == null) {
          return true;
      }
      return false;
   }
}