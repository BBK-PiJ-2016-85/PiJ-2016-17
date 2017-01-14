public class StackImpl implements Stack {
    List store = new ListImpl();

    public ReturnObject pop(){
        return store.remove(0);
    }
}