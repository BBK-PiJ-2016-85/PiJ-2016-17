public class HospitalManager {

  private Patient head; // first, firstPatient

  public void acceptPatient(Patient patient) {
     if (head == null) {
        head = patient;
        return;
     }
     Patient current = head;
     while (current.next != null) {
         current = current.next;
     }
     current.next = patient;
     patient.prev = current;
  }

  // Returns true if the patient is found to be 
  // released, false otherwise
  public boolean releasePatient(String name) {
      if (head == null) {
         return false;
      }
      Patient current = head;
      while (current != null && !current.name.equals(name)) {
          current = current.next;
      }
      if (current == null) {
         System.out.println(name + " was not found!");
         return false;
      }
      if (current == head) {
          head = head.next;
      }
      if (current.prev != null) {
         current.prev.next = current.next;
      }
      if (current.next != null) {
         current.next.prev = current.prev;
      }
      return true;
  }

  public void printPatientList() {
      if (head == null) {
         System.out.println("No patients!");
         return;
      }
      Patient current = head;
      do {
         System.out.print(current.name + ", " + current.age + ": "); 
         System.out.println(current.illness); 
         current = current.next;
      } while (current != null);
  }

  public void printPatientListBackwards() {
      if (head == null) {
         System.out.println("No patients!");
         return;
      }
      Patient current = head;
      while (current.next != null) {
         current = current.next;
      }
      do {
         System.out.print(current.name + ", " + current.age + ": "); 
         System.out.println(current.illness); 
         current = current.prev;
      } while (current != null);      
  }
}














