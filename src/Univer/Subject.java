package Univer;

import java.util.Arrays;

public class Subject {

    private String name;
    private Teacher[] teachers;

    public Subject(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void addNewTeacher(Teacher teacher) {

        teachers = Arrays.copyOf(teachers, teachers.length+1);
        teachers[teachers.length - 1] = teacher;
    }

}
