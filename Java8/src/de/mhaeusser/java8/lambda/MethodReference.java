package de.mhaeusser.java8.lambda;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {
        Function<String, Integer> converter = Integer::parseInt;
        Integer number = converter.apply("10");
        System.out.println(number);
    }
}
