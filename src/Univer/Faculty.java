package Univer;

import java.util.Arrays;

public class Faculty {

    private final String name;
    private Subject[] subjects;
    private Student[] students;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student[] allStudents, Student student){
        University.addNewArrElWithCheck(allStudents, students, student);
    }
}
