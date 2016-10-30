package Univer;

class Teacher extends Person{

    private AcademicDegree academDegree;

    Teacher(String name, Gender gender, AcademicDegree academDegree) {
        super(name, gender);
        this.academDegree = academDegree;
    }

    AcademicDegree getAcademDegree() {
        return academDegree;
    }

    void setAcademDegree(AcademicDegree academDegree) {
        this.academDegree = academDegree;
    }
}
