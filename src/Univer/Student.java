package Univer;

import java.util.Arrays;

class Student extends Person{

    static final int MIN_COURSE = 1;
    static final int MAX_COURSE = 5;

    private int course;
    private boolean isFinished = false;
    private Teacher[] teachers = new Teacher[0];
    private Subject[] reviewedSubjects = new Subject[0];

    Student(String name, Gender gender, int course) {
        super(name, gender);
        this.course = course;
    }

    int getCourse() {
        return course;
    }

    void setCourse(int course) {
        if( course >= MIN_COURSE && course <= MAX_COURSE) {
            this.course = course;
        } else {
            throw new RuntimeException("Course should be between " + MIN_COURSE + " and " + MAX_COURSE);
        }
    }

    boolean isFinished() {
        return isFinished;
    }

    void setFinished(boolean finished) {
        isFinished = finished;
    }

    Teacher[] getTeachers() {
        return teachers;
    }

    void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    Subject[] getReviewedSubjects() {
        return reviewedSubjects;
    }

    void setReviewedSubjects(Subject[] reviewedSubjects) {
        this.reviewedSubjects = reviewedSubjects;
    }
}
