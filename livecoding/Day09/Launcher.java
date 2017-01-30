public class Launcher {
    public static void main(String[] args) {

        Stack<Integer> integerStack = new StackImpl<Integer>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        while (!integerStack.isEmpty()) {
            System.out.println(integerStack.pop());
        }

        Stack<Double> doubleStack = new StackImpl<Double>();
        doubleStack.push(1.0);
        doubleStack.push(2.2);
        doubleStack.push(3.4);
        doubleStack.push(4.5);
        while (!doubleStack.isEmpty()) {
            System.out.println(doubleStack.pop());
        }

    }
}