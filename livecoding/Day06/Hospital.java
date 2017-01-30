public class Hospital {

    Patient head = null; // or first or firstPatient

    public void addPatient(Patient patient) {
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

    public void releasePatient(String name) {
        if (head == null) {
             System.out.println("Empty hospital. Nobody to release.");
             return;
        }
        if (head.name.equals(name)) {
             head = head.next;
             if (head != null) {
                head.prev = null; 
             }
             return;
        }
	Patient current = head;
        while (current != null && !current.name.equals(name)) {
           current = current.next;
        }
        if (current == null) {
             System.out.println("Could not find " + name + "!!");
             return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public void printPatientList() {
         if (head == null)  {
            System.out.println("No patients!");
            return;
         }
         Patient current = head;
         while (current.next != null) {
              System.out.println(current.name + ": " + current.illness);
              current = current.next;
         }
         System.out.println(current.name + ": " + current.illness);
    }

    public void printPatientListBackwards() {
         if (head == null)  {
            System.out.println("No patients!");
            return;
         }
         Patient current = head;
         while (current.next != null) {
              current = current.next;
         }         
	 while (current != head) {
              System.out.println(current.name + ": " + current.illness);
              current = current.prev;
         }
         System.out.println(current.name + ": " + current.illness);
    }
}