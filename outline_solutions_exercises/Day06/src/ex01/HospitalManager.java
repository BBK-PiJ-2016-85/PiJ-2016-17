package ex01;

public class HospitalManager {

  private Patient patientListStart = null;

  public static void main(String[] args) {
    HospitalManager hm = new HospitalManager();
    hm.launch();
  }

  private void launch() {

    Patient firstPatient = new Patient("John", 33, "Tuberculosis");
    patientListStart = firstPatient;

    Patient secondPatient = new Patient("Mary", 66, "Meningitis");
    addPatient(secondPatient);
    Patient thirdPatient = new Patient("Sophia", 16, "Headache");
    addPatient(thirdPatient);
    Patient anotherPatient = new Patient("Jane", 26, "Broken leg");
    addPatient(anotherPatient);
    Patient anotherPatientTwo = new Patient("Tom", 16, "Shoulder");
    addPatient(anotherPatientTwo);
    Patient patient6 = new Patient("Clark", 48, "Ears");
    addPatient(patient6);
    Patient patient7 = new Patient("John", 34, "Weight");
    addPatient(patient7);
    Patient patient8 = new Patient("Jim", 84, "Knees");
    addPatient(patient8);
    Patient patient9 = new Patient("Benny", 98, "Cold");
    addPatient(patient9);
    Patient patient10 = new Patient("Debs", 77, "Cat");
    addPatient(patient10);

    printPatients();

    boolean deleted;
    deleted = deletePatient(patient8);
    System.out.println("Jim deleted: " + deleted);
    printPatients();
    deleted = deletePatient(anotherPatient);
    System.out.println("Jane deleted: " + deleted);
    printPatients();

    // now try and delete first one by point patientListStart at one along chain...
    System.out.println("Deleting first patient John, by updating pointer");
    patientListStart = patientListStart.getNextPatient();
    printPatients();

  }

  private void printPatients() {
    Patient printThisPatient = patientListStart;
    Patient nextPatient;
    do {
      System.out.println("NAME: " + printThisPatient.getName() +
                           "\t AGE: " + printThisPatient.getAge() +
                           "\tILLNESS: " + printThisPatient.getIllness());
      nextPatient = printThisPatient.getNextPatient();
      printThisPatient = nextPatient;
    } while (nextPatient != null);
  }

  public void addPatient(Patient newPatient) {
    Patient pointer = patientListStart;
    if (pointer == null) {
      pointer = newPatient;
    } else {
      while (pointer.getNextPatient() != null) {
        pointer = pointer.getNextPatient();
      }
      pointer.setNextPatient(newPatient);
    }
  }

  public boolean deletePatient(Patient patient) {
    Patient pointer = patientListStart;
    if (pointer == null) {
      // patient not present as list empty
      return false;
    } else {
      if (pointer.getName().equals(patient.getName())) {
        // first element is the patient we wish to delete
        patientListStart = pointer.getNextPatient();
        return true;
      } else {
        // look down the rest of the list
        while (pointer.getNextPatient().getName() != patient.getName() && pointer != null) {
          pointer = pointer.getNextPatient();
        }
        if (pointer == null) {
          return false;
        } else {
          pointer.setNextPatient(pointer.getNextPatient().getNextPatient());
          return true;
        }
      }
    }
  }
}
