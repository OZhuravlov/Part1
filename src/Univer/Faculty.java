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

        for (Student stud : allStudents) {
            if(stud == student  && !checkStudent(student)){
                University.addNewArrayElement(students, student);
                break;
            }
        }
    }

    boolean checkStudent(Student student){

        boolean ret = false;
        for (Student stud : students) {
            if(stud == student){
                University.addNewArrayElement(students, student);
                ret = true;
            }
        }
        return ret;
    }
}
