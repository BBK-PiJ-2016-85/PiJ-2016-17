public class StackImpl<T extends Number> implements Stack<T> {

   private StackNode<T> head = null;
   
   public boolean isEmpty() {
      return (head == null);
   }

   public void push(T object) {
       StackNode<T> newNode = new StackNode<T>(object);
       newNode.setNext(head);
       head = newNode;
   }

   public T pop() {
       if (this.isEmpty()) {
           return null;
       }

       T result = head.getValue();
       head = head.getNext();
       return result;
   }

}