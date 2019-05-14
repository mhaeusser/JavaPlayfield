package de.mhaeusser.java8.lambda;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class FoldTest {

    public static void main(String[] args) {
        goOld();
        goNew();
    }

    public static void goOld() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = sum + i * i;
        }
        System.out.println(sum);
    }

    public static void goNew() {
        IntUnaryOperator square = x -> x * x;
        IntBinaryOperator add = (x, y) -> x + y;
        //assertThat(IntStream.range(1, 11).map(square).reduce(0, add), is(385));
        int sum = IntStream.range(1, 11).map(square).reduce(0, add);
        System.out.println(sum);
    }
}
