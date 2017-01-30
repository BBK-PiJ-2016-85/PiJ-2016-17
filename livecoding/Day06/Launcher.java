public class Launcher {

  public static void main(String[] args) {
    Launcher launcher = new Launcher();
    launcher.launch();
  }

  private void launch() {
    HospitalManager hospital = new HospitalManager();

    System.out.println("Open in the morning!");
    hospital.printPatientList();
    System.out.println("");

    Patient newPatient = new Patient("John", 30, "Flu");
    hospital.acceptPatient(newPatient);
    newPatient = new Patient("Mary", 25, "Broken leg");
    hospital.acceptPatient(newPatient);
    newPatient = new Patient("Mark", 60, "Flu");
    hospital.acceptPatient(newPatient);

    hospital.printPatientList();
    hospital.printPatientListBackwards();
    System.out.println("");

    hospital.releasePatient("John");
    hospital.releasePatient("Matt");

    hospital.printPatientList();
    hospital.printPatientListBackwards();
  }
}