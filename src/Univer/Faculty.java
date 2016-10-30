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

        boolean isFound = false;

        for (Student s : this.students) {
            if(s == student){
                for (Student ls : localStudents) {
                    if(ls == student){
                        isFound = true;
                        break;
                    }
                }
                if(!isFound){
                    localStudents = addStudent(localStudents, student);
                }
                break;
            }
        }
        return localStudents;
    }
}
