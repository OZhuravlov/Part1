package Univer;

import java.util.Arrays;

class Faculty {

    private final String name;
    private Subject[] subjects = new Subject[0];
    private Student[] students = new Student[0];

    Faculty(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    Subject[] getSubjects() {
        return this.subjects;
    }

    Student[] getStudents() {
        return this.students;
    }

    void addNewStudent(String studentName, Gender studentGender, int course) {

        Student student = new Student(studentName, studentGender, course);
        this.students = addStudent(this.students, student);

    }

    private Student[] addStudent(Student[] students, Student student) {

        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
        return students;

    }

    Student[] addStudentWithCheck(Student[] localStudents, Student student){

        try {
            if( University.isCanBeAdded(this.students, localStudents, student) ){
                localStudents = addStudent(localStudents, student);
            }
        } catch( EUnivElemNotExists e ) {
            throw new EUnivElemNotExists("Student " + student.getName() + " does not exists in University's list");
        } catch( EUnivElemAlreadyExists e ) {
            throw new EUnivElemAlreadyExists("Student " + student.getName() + " is already exist in the list");
        }
        return localStudents;

    }
}
