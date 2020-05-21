package collections.classes;

public class Person implements Comparable<Person> {

    private String name;
    private int note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }

}
