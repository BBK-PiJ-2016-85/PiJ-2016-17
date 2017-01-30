public class Patient {

  public Patient(String name, int age, String condition) {
    this.name = name;
    this.age  = age;
    illness = condition;
    next = null;
    prev = null;
  }

  // public ONLY BECAUSE there are no methods - data-pure class!

  public String name;
  public int age;
  public String illness;

  public Patient next;
  public Patient prev;
  
}
