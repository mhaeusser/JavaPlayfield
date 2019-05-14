package de.mhaeusser.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamLessons {

    public static void main(String[] args) {
        random();
        skipAndFilter();
        limitAndFilter();
        squares();
    }

    public static void skipAndFilter() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> bigOdds = ints.stream()
            .skip(2)
            .filter(n -> n % 2 == 1)
            .collect(Collectors.toList());
        System.out.println(bigOdds);
    }

    public static void limitAndFilter() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        ints.stream()
            .limit(7)
            .filter(m -> m % 2 == 0)
            .peek(System.out::print)
            .collect(Collectors.toList());
        System.out.println();        
    }
    
    public static void squares() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> squares = ints.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(squares);
    }
    
    public static void random() {
        new Random().ints(0, 100).limit(10).forEach(System.out::println);
    }
}
