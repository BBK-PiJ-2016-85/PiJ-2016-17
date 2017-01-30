// Teacher.java
public class Teacher extends Object {
  private String name;

  public Teacher(String name) {
    super();  // added by Java
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void teach(String lessonName) {
    System.out.println("Teaching lesson: " + lessonName);
  }
}


// extends    => is-a
// implements => behaves-as-a
