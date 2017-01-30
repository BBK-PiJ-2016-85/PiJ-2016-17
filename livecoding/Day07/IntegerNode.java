public class IntegerNode {

    private int value;

    private IntegerNode next;

    public IntegerNode(int value) {
        this.value = value;
        this.next = null;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode node) {
        next = node;
    }

    public boolean isLast() {
        return (next == null);
    }

}