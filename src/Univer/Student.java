package Univer;

import java.util.Arrays;

class Student extends Person{

    private int course;

    Student(String name, Gender gender, int course) {
        super(name, gender);
        this.course = course;
    }

    int getCourse() {
        return course;
    }

    void setCourse(int course) {
        this.course = course;
    }
}
