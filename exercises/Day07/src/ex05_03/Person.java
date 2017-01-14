package ex05_03;

public class Person {

    private String name;
    private Person nextPerson;

    public Person() {
        name = null;
        nextPerson = null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getNextPerson() {
        return this.nextPerson;
    }

    public void setNextPerson(Person nextPerson) {
        this.nextPerson = nextPerson;
    }

}
