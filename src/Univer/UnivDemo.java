package Univer;

public class UnivDemo {

    public static void main(String[] args) {

        University univ = new University ("Tech University");

        univ.addNewFaculty("Mechanics faculty");
        univ.addNewFaculty("Physics faculty");
        univ.addNewFaculty("Maths faculty");
        System.out.println(univ.getFaculties().length);

        univ.addNewSubject("Maths");
        univ.addNewSubject("Physics");
        univ.addNewSubject("Astronomy");
        univ.addNewSubject("Mechanics");
        univ.addNewSubject("English");
        System.out.println(univ.getSubjects().length);

        univ.addNewTeacher("John Smith", Gender.Male, AcademicDegree.Candidate);
        univ.addNewTeacher("Helen Lee", Gender.Female, AcademicDegree.Doctor);
        univ.addNewTeacher("Anton Pavlov", Gender.Male, AcademicDegree.Professor);
        univ.addNewTeacher("Anna Sul", Gender.Female, AcademicDegree.Doctor);
        univ.addNewTeacher("Jim Michael", Gender.Male, AcademicDegree.Candidate);
        System.out.println(univ.getTeachers().length);

        univ.getFaculties()[0].addNewStudent("Billy Lynk", Gender.Male, 1);
        univ.getFaculties()[0].addNewStudent("Helen Lee", Gender.Female, 2);
        univ.getFaculties()[1].addNewStudent("Anton Pavlov", Gender.Male, 3);
        univ.getFaculties()[2].addNewStudent("Anna Sul", Gender.Female, 4);
        univ.getFaculties()[2].addNewStudent("Jim Michael", Gender.Male, 5);

        System.out.println(univ.getFaculties()[0].getStudents().length);
        System.out.println(univ.getFaculties()[2].getStudents().length);

    }
}
