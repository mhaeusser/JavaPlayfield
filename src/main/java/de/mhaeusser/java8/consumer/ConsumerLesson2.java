package de.mhaeusser.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLesson2 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
        Consumer<String> printString = string -> System.out.println(string);
        strings.forEach(printString);
    }
}
