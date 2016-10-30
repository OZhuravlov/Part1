package Univer;

import org.jetbrains.annotations.Contract;

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


    private Subject[] addSubjectWithCheck(Subject[] localSubjects, Subject subject) throws Exception{

        try {
            if (isCanBeAdded(this.subjects, localSubjects, subject)) {
                localSubjects = addSubject(localSubjects, subject);
            }
        } catch( EUnivElemNotExists e ) {
            throw new EUnivElemNotExists("Subject " + subject.getName() + " does not exists in University's list");
        } catch( EUnivElemAlreadyExists e ) {
            throw new EUnivElemAlreadyExists("Subject " + subject.getName() + " is already exist in the list");
        }
        return localSubjects;

    }

    private Teacher[] addTeacherWithCheck(Teacher[] localTeachers, Teacher teacher){

        try {
            if( isCanBeAdded(this.teachers, localTeachers, teacher) ){
                localTeachers = addTeacher(localTeachers, teacher);
            }
        } catch( EUnivElemNotExists e ) {
            throw new EUnivElemNotExists("Teacher " + teacher.getName() + " does not exists in University's list");
        } catch( EUnivElemAlreadyExists e ) {
            throw new EUnivElemAlreadyExists("Teacher " + teacher.getName() + " is already exist in the list");
        }
        return localTeachers;

    }

    void setSubjectTeacherToStudent(Student student, Subject subject, Teacher teacher) throws Exception{

        student.setSubjects(addSubjectWithCheck(student.getSubjects(), subject));
        if ( isArrayElExists(subject.getTeachers(), teacher) ) {
            student.setTeachers(addTeacher(student.getTeachers(), teacher));
        }

    }

    void setSubjectToTeacher(Teacher teacher, Subject subject) throws Exception{

        teacher.setSubjects(addSubjectWithCheck(teacher.getSubjects(), subject));
        subject.setTeachers(addTeacherWithCheck(subject.getTeachers(), teacher));

    }

    void setStudentSubjectReviwedOK(Student student, Subject subject) throws Exception {

        if ( isCanBeAdded(student.getSubjects(), student.getReviewedSubjects(), subject) ) {
            student.setReviewedSubjects(addSubjectWithCheck(student.getReviewedSubjects(), subject));
        }

    }

    static boolean isCanBeAdded(Object[] allObjects, Object[] localObjects, Object obj){

        boolean isFound;
        boolean ret;
        isFound = isArrayElExists(allObjects, obj);
        if( isFound ){
            isFound = isArrayElExists(localObjects, obj);
            if( !isFound ) {
                ret = true;
            } else {
                throw new EUnivElemAlreadyExists("");
            }
        } else {
            throw new EUnivElemNotExists("");
        }
        return ret;

    }

    @Contract(pure = true)
    private static boolean isArrayElExists(Object[] objects, Object obj){

        for (Object o : objects) {
            if( o == obj ){
                return true;
            }
        }
        return false;

    }

    void transferStudentToNextCourse(Student student) {

        for (Subject subject : student.getSubjects()) {
            if ( !isArrayElExists(student.getReviewedSubjects(),subject) ) {
                throw new RuntimeException("Student " + student.getName() + " has non-reviewed subjects, for example "+subject.getName());
            }
        }
        if(student.getCourse() == Student.MAX_COURSE){
            student.setFinished(true);
        }else{
            student.setCourse(student.getCourse()+1);
        }
    }
}
