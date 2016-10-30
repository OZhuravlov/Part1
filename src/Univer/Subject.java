package Univer;

import java.util.Arrays;

class Subject {

    private final String name;
    private Teacher[] teachers = new Teacher[0];

    Subject(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    Teacher[] getTeachers() {
        return teachers;
    }

    void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
