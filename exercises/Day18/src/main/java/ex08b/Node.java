package ex08b;

class Node {
    private int item;   
    private Node nextNode;
    
    public Node() {
        this.nextNode = null;
    }
    
    public Node (int item) {
        this.item = item;
        this.nextNode = null;
    }
    
    public void setItem(int item) {
        this.item = item;
    }   
        
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }   
    
    public Node getNextNode() {
        return nextNode;
    }
    
    public int getItem() {
        return item;
    }       
}   