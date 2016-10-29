package Univer;

import java.util.Arrays;

public abstract class Person {

    private final String name;
    private final Gender gender;
    private static Subject[] subjects;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}
