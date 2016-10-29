package Univer;

public class UnivDemo {

    public static void main(String[] args) {

        Subject[] subjects = {new Subject("Maths", null)
                , new Subject("Physics", null)
                , new Subject("Astronomy", null)
                , new Subject("Mechanics", null)
                , new Subject("English", null)
        };

        Teacher[] teachers = {new Teacher("John Smith", Gender.Male, AcademicDegree.Candidate)
                , new Teacher("Helen Lee", Gender.Female, AcademicDegree.Doctor)
                , new Teacher("Anton Pavlov", Gender.Male, AcademicDegree.Professor)
                , new Teacher("Anna Sul", Gender.Female, AcademicDegree.Doctor)
                , new Teacher("Jim Michael", Gender.Male, AcademicDegree.Candidate)
        };

        Faculty[] faculties = {new Faculty("Mechanics faculty")
                , new Faculty("Physics faculty")
                , new Faculty("Maths faculty")
        };

        Student[] students =  {new Student("Billy Idol", Gender.Male, 1)
                , new Student("Helen Lee", Gender.Female, 2)
                , new Student("Anton Pavlov", Gender.Male, 3)
                , new Student("Anna Sul", Gender.Female, 4)
                , new Student("Jim Michael", Gender.Male, 5)
        };

        University university = new University ("Tech University");

        System.out.println();

    }
}
