package Univer;

import java.util.Arrays;

abstract class Person {

    private final String name;
    private final Gender gender;
    private Subject[] subjects = new Subject[0];

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    Gender getGender() {
        return gender;
    }

    String getName() {
        return name;
    }

    Subject[] getSubjects() {
        return subjects;
    }

    void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

}
