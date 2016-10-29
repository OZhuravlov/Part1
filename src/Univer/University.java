package Univer;

import java.util.Arrays;

public class University {

    private final String name;
    private Faculty[] faculties = new Faculty[0];
    private Teacher[] teachers = new Teacher[0];
    private Student[] students = new Student[0];
    private Subject[] subjects = new Subject[0];

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addNewFaculty(Faculty faculty) {
        addNewArrayElement(faculties, faculty);
    }

    public void addNewSubject(Subject subject) {
        addNewArrayElement(subjects, subject);
    }

    public void addNewTeacher(Teacher teacher) {
        addNewArrayElement(teachers, teacher);
    }

    public void addNewStudent(Student student) {
        addNewArrayElement(students, student);
    }

    public static void addNewArrayElement(Object[] objects, Object object) {
        objects = Arrays.copyOf(objects, objects.length + 1);
        objects[objects.length - 1] = object;
    }
}
