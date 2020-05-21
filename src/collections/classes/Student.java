package collections.classes;

import java.util.HashMap;

public class Student {

    private int registration;
    private String name;
    private HashMap<Integer, Student> crud;

    public Student() {
        crud = new HashMap<>();
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, Student> allStudent() {
        return crud;
    }

    public String removeStudent(int matricula) {
        crud.remove(matricula);
        return "deletado";
    }


    public Student findStudent(int matricula) {
        return crud.get(matricula);
    }

    public void addStudent(Student student) {
        crud.put(student.getRegistration(), student);
        System.out.println("Cadastrado");
    }

    @Override
    public String toString() {
        return name;
    }
}
