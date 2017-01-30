public class PointerBasedPersonQueue implements PersonQueue {

    private Person tail = null;

    /**
    * Adds another person to the queue.
    */
    public void insert(Person person) {
	if (tail == null) {
            tail = person;
            return;
        }
        person.setNext(tail);
        tail = person;
    }

    /**
    * Removes a person from the queue.
    */
    public Person retrieve() {
        if (tail == null) {
            return null;
        }
        if (tail.getNext() == null) {
            Person result = tail;
            tail = null;
            return result;
        }
        Person current = tail;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        Person result = current.getNext();
        current.setNext(null);
        return result;
    }

}
