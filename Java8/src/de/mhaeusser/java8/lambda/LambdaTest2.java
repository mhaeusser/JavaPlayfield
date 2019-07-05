package de.mhaeusser.java8.lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.function.IntUnaryOperator;

public class LambdaTest2 {

    public static void main(String[] args) {
        IntUnaryOperator func = x -> 3 * x;
        assertThat(apply(func, 5), is(15));
    }

    static int apply(IntUnaryOperator func, int arg) {
        return func.applyAsInt(arg);
    }
}
