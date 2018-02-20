package de.mhaeusser.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;

public class StreamTest2 {

    final static List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 45, 50);

    public static void main(String[] args) {

        System.out.println(numbers.stream().map(i -> i));

        goOld();
        goNew();
    }

    public static void goOld() {
        int sum = 0;
        for (int price : numbers) {
            sum += price;
        }
        System.out.println("Sum (Old): " + sum);
    }

    public static void goNew() {

        int sum1 = numbers.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println("sum1: " + sum1);

        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum2: " + sum2);

        int sum3 = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("sum3: " + sum3);

        LongAdder a = new LongAdder();
        numbers.parallelStream().forEach(a::add);
        int sum4 = a.intValue();
        System.out.println("sum4: " + sum4);

        int sum5 = numbers.stream().reduce(0, (x,y) -> x+y);
        System.out.println("sum5: " + sum5);

        int sum6 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("sum6: " + sum6);

        int sum7 = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("sum7: " + sum7);
    }
}
