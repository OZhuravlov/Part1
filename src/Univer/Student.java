package Univer;

import java.util.Arrays;

public class Student extends Person{

    private int course;

    public Student(String name, Gender gender, int course) {
        super(name, gender);
        this.course = course;
    }
}
