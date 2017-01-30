public class IntegerQueueImpl implements IntegerQueue {

    private IntegerNode last = null; 

    private IntegerNode first = null;  

    public void insert(int value) {
        IntegerNode node = new IntegerNode(value);
        if (node == null) {
            return; // nothing to do
        }
        if (last == null) {
            last = node;
            first = node;
            return;
        }
        node.setNext(last);
        last = node;    // NOTE: same as "this.last = node"
    }

    public IntegerNode retrieve() {
        if (first == null) {
            return null;
        }
        if (first == last) {
            IntegerNode result = last;  // ...and only
            last = null;
            first = null;
            return result;
        }
        IntegerNode result = first;
        // We need to find the element before the first
        IntegerNode current = last;
        while (current.getNext() != first) {
            current = current.getNext();
        }
        // now 'current' is pointing to the first-but-one
        current.setNext(null);  // from now on, this is the first element
        first = current;
        return result;
    }
}