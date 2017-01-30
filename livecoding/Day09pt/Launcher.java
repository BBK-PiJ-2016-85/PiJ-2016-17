public class Launcher {

    public static void main(String[] args) {
        Stack<Integer> intStack = new StackImpl<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        while(!intStack.isEmpty()) {
           System.out.println(intStack.pop());
        }
        Stack<Double> doubleStack = new StackImpl<>();
        doubleStack.push(1.0);
        doubleStack.push(2.2);
        doubleStack.push(4.3);
        while(!doubleStack.isEmpty()) {
           System.out.println(doubleStack.pop());
        }

/*********************
        Stack<String> stringStack = new StackImpl<>();
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");
        stringStack.push("E");
        while(!stringStack.isEmpty()) {
           System.out.println(stringStack.pop());
        }
****************************/

    }

}