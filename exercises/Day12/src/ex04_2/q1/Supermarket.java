package ex04_2.q1;

public class Supermarket {
  private PersonQueue queue;

  public Supermarket() {
    queue = new SupermarketQueue();
  }

  public void addPerson(Person newPerson) {
    queue.insert(newPerson);
  }

  public Person servePerson() {
    return queue.retrieve();
  }
}



