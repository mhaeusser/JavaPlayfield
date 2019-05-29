package de.mhaeusser.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateTest {

    public static void main(String args[]) {

        // create a list of strings 
        List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        // declare the predicate type as string and use a lambda expression
        Predicate<String> p = (s) -> s.startsWith("G");

        for (String name : names) {
            if (p.test(name))
                System.out.println(name);
        }
    }
}
