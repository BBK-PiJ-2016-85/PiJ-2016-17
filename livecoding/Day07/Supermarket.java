public class Supermarket {

   private PersonQueue queueA = new PointerBasedPersonQueue();

   private PersonQueue queueB = new PointerBasedPersonQueue();

   public static void main(String[] args) {
      Person customer1 = new Person("John");
      Person customer2 = new Person("Mary");
      Person customer3 = new Person("Mark");
      Person customer4 = new Person("Matt");
      Supermarket market = new Supermarket();
      market.addPerson(customer1);
      market.addPerson(customer2);
      market.addPerson(customer3);
      market.servePerson();
      market.addPerson(customer4);
      market.servePerson();
      market.servePerson();
      market.servePerson();
   }

   public void addPerson(Person customer) {
       queueA.insert(customer);
       System.out.println("Customer " + customer.getName() + " is queueing...");
   }

   public void servePerson() {
       Person customerServed = queueA.retrieve();
       System.out.println(customerServed.getName() + ": happily served.");
   }

}