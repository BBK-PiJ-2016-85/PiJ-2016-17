package ex03;

public class Patient {

  private String name;
  private int age;
  private String illness;
  private Patient nextPatient;
  private Patient previousPatient;

  public Patient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
    this.nextPatient = null;
    this.previousPatient = null;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getIllness() {
    return illness;
  }

  public Patient getNextPatient() {
    return nextPatient;
  }

  public void setNextPatient(Patient p) {
    nextPatient = p;
  }

  public Patient getPreviousPatient() {
    return previousPatient;
  }

  public void setPreviousPatient(Patient previousPatient) {
    this.previousPatient = previousPatient;
  }

  public String print() {
    return "Name: " + name + " Age: " + age + " Illness: " + illness;
  }
}
