// Lecturer.java
/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer extends Teacher {
    public void doResearch(String topic) {
        System.out.println("Doing research on: " + topic);
    }

    // added by Java (1)
    // public Lecturer() {
    //     super(); // added by Java (2)
    // }

    public Lecturer(String name) {
       super(name);
    }
}
  

    }
}

