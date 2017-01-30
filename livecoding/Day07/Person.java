public class Person {

   private String name = null;

   private Person next = null;

   public Person(String name) {
        this.name = name;

   }

   public String getName() {
       return name;
   }

   public Person getNext() {
      return next;
   }
 

   public void setNext(Person person) {
        next = person;
   }

}
