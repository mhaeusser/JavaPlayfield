package de.mhaeusser.java8.streams.reduce;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getAge() {
        return birthday.getYear(); // TODO
    }

    public String getName() {
        return name;
    }
}
