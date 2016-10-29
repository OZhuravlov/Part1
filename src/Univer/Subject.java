package Univer;

import java.util.Arrays;

public class Subject {

    private final String name;
    private Teacher[] teachers;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {

        teachers = Arrays.copyOf(teachers, teachers.length+1);
        teachers[teachers.length - 1] = teacher;
    }

}
