package ex04_2.q2;

public class Supermarket {

  private PersonQueue q1;
  private PersonQueue q2;

  public Supermarket() {
//		q1 = new SupermarketQueue();
    q2 = new TakeNumberQueue();
  }

  public void addPerson(Person newPerson) {
//		queue1.insert(newPerson);
    q2.insert(newPerson);
  }

  public Person servePerson() {
    //		Person next = queue1.retrieve();
    Person next = q2.retrieve();
    return next;
  }
}



