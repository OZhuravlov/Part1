package Univer;

import java.util.Arrays;

public class UnivDemo {

    public static void main(String[] args) throws Exception {

        University univ = new University ("Tech University");
        Student student;
        Teacher[] teachers;
        Subject[] subjects;

        univ.addNewFaculty("Mechanics faculty");
        univ.addNewFaculty("Physics faculty");
        univ.addNewFaculty("Maths faculty");
        System.out.println("Faculty count: " + univ.getFaculties().length);

        univ.addNewSubject("Maths");
        univ.addNewSubject("Physics");
        univ.addNewSubject("Astronomy");
        univ.addNewSubject("Mechanics");
        univ.addNewSubject("English");
        System.out.println("Subject count: " + univ.getSubjects().length);

        univ.addNewTeacher("John Smith", Gender.Male, AcademicDegree.Candidate);
        univ.addNewTeacher("Helen Lee", Gender.Female, AcademicDegree.Doctor);
        univ.addNewTeacher("Anton Pavlov", Gender.Male, AcademicDegree.Professor);
        univ.addNewTeacher("Anna Sul", Gender.Female, AcademicDegree.Doctor);
        univ.addNewTeacher("Jim Michael", Gender.Male, AcademicDegree.Candidate);
        System.out.println("Teacher count: " + univ.getTeachers().length);

        univ.setSubjectToTeacher(univ.getTeachers()[0], univ.getSubjects()[1]);
        univ.setSubjectToTeacher(univ.getTeachers()[2], univ.getSubjects()[1]);
        univ.setSubjectToTeacher(univ.getTeachers()[4], univ.getSubjects()[2]);
        univ.setSubjectToTeacher(univ.getTeachers()[4], univ.getSubjects()[3]);
        univ.setSubjectToTeacher(univ.getTeachers()[3], univ.getSubjects()[0]);

        teachers = univ.getTeachers();
        subjects = univ.getSubjects();

        System.out.println("----------");
        System.out.println("Test 1. All subject reviews done. Should be transfered to the next course");

        univ.getFaculties()[0].addNewStudent("Billy Lynk", Gender.Male, 1);
        univ.getFaculties()[0].addNewStudent("Helen Lee", Gender.Female, 2);

        student = univ.getFaculties()[0].getStudents()[0];

        System.out.println("current course = " + student.getCourse());

        univ.setSubjectTeacherToStudent(student, subjects[1], teachers[2]);
        univ.setSubjectTeacherToStudent(student, subjects[2], teachers[4]);

        univ.setStudentSubjectReviwedOK(student, subjects[1]);
        univ.setStudentSubjectReviwedOK(student, subjects[2]);

        univ.transferStudentToNextCourse(student);

        System.out.print("new course = " + student.getCourse());
        System.out.println(". University finished = " + student.isFinished());

        System.out.println("----------");
        System.out.println("Test 2. All subject reviews done. Should finish University");

        univ.getFaculties()[2].addNewStudent("Anna Sul", Gender.Female, 4);
        univ.getFaculties()[2].addNewStudent("Jim Michael", Gender.Male, 5);

        student = univ.getFaculties()[2].getStudents()[1];

        System.out.println("current course = " + student.getCourse());

        univ.setSubjectTeacherToStudent(student, subjects[3], teachers[4]);
        univ.setSubjectTeacherToStudent(student, subjects[2], teachers[4]);

        univ.setStudentSubjectReviwedOK(student, subjects[3]);
        univ.setStudentSubjectReviwedOK(student, subjects[2]);

        univ.transferStudentToNextCourse(student);

        System.out.print("new course = " + student.getCourse());
        System.out.println(". University finished = " + student.isFinished());

        System.out.println("----------");
        System.out.println("Test 3. Reviews incomplete. Exception should be raised");

        univ.getFaculties()[1].addNewStudent("Anton Pavlov", Gender.Male, 3);

        student = univ.getFaculties()[1].getStudents()[0];

        System.out.println("current course = " + student.getCourse());
        univ.setSubjectTeacherToStudent(student, subjects[0], teachers[3]);
        univ.setSubjectTeacherToStudent(student, subjects[2], teachers[4]);
        univ.setStudentSubjectReviwedOK(student, subjects[2]);
        try {
            univ.transferStudentToNextCourse(student);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.print("new course = " + student.getCourse());
        System.out.println(". University finished = " + student.isFinished());
    }
}
