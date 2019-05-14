package de.mhaeusser.java8.streams.reduce;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

// see https://docs.oracle.com/javase/tutorial/collections/streams/index.html
public class ReduceLesson {

    public static void main(String[] args) {
        
        List<Person> roster = Arrays.asList(
                new Person("Alpha", LocalDate.of(1970, 12, 28), Person.Sex.FEMALE),
                new Person("Beta", LocalDate.of(1975, 2, 12), Person.Sex.FEMALE));
        
        roster
            .stream()
            .forEach(e -> System.out.println(e.getName()));
    }
}
