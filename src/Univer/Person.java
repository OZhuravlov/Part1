package Univer;

import java.util.Arrays;

abstract class Person {

    private final String name;
    private final Gender gender;
    private static Subject[] subjects;

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
}
