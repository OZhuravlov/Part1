package Univer;

import java.util.Arrays;

class University {

    private final String name;
    private Faculty[] faculties = new Faculty[0];
    private Teacher[] teachers = new Teacher[0];
    private Subject[] subjects = new Subject[0];

    University(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    Faculty[] getFaculties() {
        return this.faculties;
    }

    Subject[] getSubjects() {
        return this.subjects;
    }

    Teacher[] getTeachers() {
        return this.teachers;
    }

    void addNewFaculty(String facultyName) {

        Faculty faculty = new Faculty(facultyName);
        this.faculties = Arrays.copyOf(this.faculties, faculties.length + 1);
        this.faculties[this.faculties.length - 1] = faculty;
    }

    void addNewTeacher(String teacherName, Gender teacherGender, AcademicDegree academDegree) {

        Teacher teacher = new Teacher(teacherName, teacherGender, academDegree);
        this.teachers = addTeacher(this.teachers, teacher);

    }

    private Teacher[] addTeacher(Teacher[] teachers, Teacher teacher) {

        teachers = Arrays.copyOf(teachers, teachers.length + 1);
        teachers[teachers.length - 1] = teacher;
        return teachers;
    }

    void addNewSubject(String subjName) {

        Subject subject = new Subject(subjName);
        this.subjects = addSubject(this.subjects, subject);

    }

    private Subject[] addSubject(Subject[] subjects, Subject subject) {

        subjects = Arrays.copyOf(subjects, subjects.length + 1);
        subjects[subjects.length - 1] = subject;
        return subjects;
    }


    Subject[] addSubjectWithCheck(Subject[] localSubjects, Subject subject){

        boolean isFound = false;

        for (Subject s : this.subjects) {
            if(s == subject){
                for (Subject ls : localSubjects) {
                    if(ls == subject){
                        isFound = true;
                        break;
                    }
                }
                if(!isFound){
                    localSubjects = addSubject(localSubjects, subject);
                }
                break;
            }
        }
        return localSubjects;
    }

    Teacher[] addTeacherWithCheck(Teacher[] localTeachers, Teacher teacher){

        boolean isFound = false;

        for (Teacher s : this.teachers) {
            if(s == teacher){
                for (Teacher ls : localTeachers) {
                    if(ls == teacher){
                        isFound = true;
                        break;
                    }
                }
                if(!isFound){
                    localTeachers = addTeacher(localTeachers, teacher);
                }
                break;
            }
        }
        return localTeachers;
    }
}
