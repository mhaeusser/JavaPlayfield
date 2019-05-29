package de.mhaeusser.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateTest {

    public static void main(String args[]) {

        // create a list of strings 
        List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "GG", "Geek2");

        // declare the predicate type as string and use a lambda expression
        Predicate<String> startsPred = (s) -> s.startsWith("G");
        dump(names, startsPred);
        Predicate<String> lengthPred = (s) -> s.length() < 3;
        dump(names, lengthPred);
        Predicate<String> lengthNotPred = lengthPred.negate();
        dump(names, lengthNotPred);
        Predicate<String> startsAndLengthPred = startsPred.and(lengthPred);
        dump(names, startsAndLengthPred);
        Predicate<String> startsOrLengthPred = startsPred.or(lengthPred);
        dump(names, startsOrLengthPred);
    }

    public static void dump(List<String> strings, Predicate<String> pred) {
        for (String name : strings) {
            if (pred.test(name))
                System.out.println(name);
        }
        System.out.println();
    }
}
