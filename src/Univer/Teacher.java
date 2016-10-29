package Univer;

public class Teacher extends Person{

    private AcademicDegree academDegree;

    public Teacher(String name, Gender gender, AcademicDegree academDegree) {
        super(name, gender);
        this.academDegree = academDegree;
    }

}
