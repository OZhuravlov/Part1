package Univer;

import java.util.Arrays;

class Subject {

    private final String name;
    private Teacher[] teachers;

    Subject(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    Teacher[] getTeachers() {
        return teachers;
    }

    void addTeacher(Teacher teacher) {

        teachers = Arrays.copyOf(teachers, teachers.length+1);
        teachers[teachers.length - 1] = teacher;
    }

}
