package ex03;

public class HospitalManager {

  private Patient patientListStart = null;

  public static void main(String[] args) {
    HospitalManager hm = new HospitalManager();
    hm.launch();
  }

  private void launch() {

    printPatients();

    // Part 1

    Patient firstPatient = new Patient("John", 33, "Tuberculosis");
    patientListStart = firstPatient;

    Patient secondPatient = new Patient("Mary", 66, "Meningitis");
    addPatient(secondPatient);
    Patient thirdPatient = new Patient("Shane", 16, "Headache");
    addPatient(thirdPatient);
    Patient anotherPatient = new Patient("Jane", 26, "Broken leg");
    addPatient(anotherPatient);
    Patient anotherPatientTwo = new Patient("Tom", 16, "Shoulder");
    addPatient(anotherPatientTwo);
    Patient patient6 = new Patient("Michael", 48, "Ears xx");
    addPatient(patient6);
    Patient patient7 = new Patient("Jonny", 34, "Weight xx");
    addPatient(patient7);
    Patient patient8 = new Patient("Jim", 84, "Knees xx");
    addPatient(patient8);
    Patient patient9 = new Patient("Benny", 98, "Cold xx");
    addPatient(patient9);
    Patient patient10 = new Patient("Marie", 77, "Cat xxxx");
    addPatient(patient10);

    // Part 2
    printPatients();

    // check how long the list is
    System.out.println("There are: " + countPatients() + " patients");

    // Part 3
    System.out.println("Jim deleted: " + deletePatient(patient8));
    printPatients();

    System.out.println("Jane deleted: " + deletePatient(anotherPatient));
    printPatients();

    // check how long the list is
    System.out.println("There are: " + countPatients() + " patients");

    //part 5... add a new element to the list...
    System.out.println("Adding Dreamer");
    Patient patientOneLast = new Patient("Dreamer", 11, "Much sleep");
    addPatient(patientOneLast);
    printPatients();

    //more part 5... and try to delete one that is not on the list
    Patient patientNotOnList = new Patient("Daisy", 99, "Dimples");
    System.out.println("Deleted patientNotOnList: " + deletePatient(patientNotOnList));

    //part 6...print both ways one last time
    printPatients();

    System.out.println("There are: " + countPatients() + " patients");
  }

  private int countPatients() {
    int result = 0;
    Patient nextPatient = patientListStart;
    do {
      result++;
      nextPatient = nextPatient.getNextPatient();
    } while (nextPatient != null);
    return result;
  }

  private void printPatients() {
    if (patientListStart == null) {
      System.out.println("There are no patients");
      return;
    }
    System.out.println("\nPRINTING FORWARDS....");
    printPatientsForwards();
    System.out.println("\nPRINTING BACKWARDS....");
    printPatientsBackwards();
    System.out.println();
  }

  private void printPatientsForwards() {
    Patient printThisPatient = patientListStart;

    while (printThisPatient != null) {
      System.out.println(printThisPatient.print());
      printThisPatient = printThisPatient.getNextPatient();
    }
  }

  private void printPatientsBackwards() {
    Patient thisPatient = patientListStart;

    // walk to the end of the list
    while (thisPatient.getNextPatient() != null) {
      thisPatient = thisPatient.getNextPatient();
    }

    while (thisPatient != null) {
      System.out.println("NAME: " + thisPatient.getName());
      thisPatient = thisPatient.getPreviousPatient();
    }
  }

  // add a patient to the list

  public void addPatient(Patient newPatient) {

    if (patientListStart == null) {
      patientListStart = newPatient;
      newPatient.setPreviousPatient(patientListStart);
      return;
    }

    Patient pointer = patientListStart;

    while (pointer.getNextPatient() != null) {
      pointer = pointer.getNextPatient();
    }
    pointer.setNextPatient(newPatient);
    newPatient.setPreviousPatient(pointer);
  }

  // delete a patient from the list

  public boolean deletePatient(Patient patient) {
    if (patientListStart == null) {
      return false;
    }

    // first element is the patient we wish to delete
    if (patientListStart.getName().equals(patient.getName())) {
      patientListStart = patientListStart.getNextPatient();
      patientListStart.getNextPatient().setPreviousPatient(patientListStart);
      return true;
    }
    Patient pointer = patientListStart;

    // look down the rest of the list
    while (pointer.getNextPatient() != null && pointer.getNextPatient().getName() != patient.getName()) {
      System.out.println(pointer.getNextPatient().print());
      pointer = pointer.getNextPatient();
    }

    if (pointer.getNextPatient() == null) {
      return false;
    } else { // found it!
      Patient nextElement = pointer.getNextPatient().getNextPatient();
      pointer.setNextPatient(nextElement);
      nextElement.setPreviousPatient(pointer);
      return true;
    }
  }
}
