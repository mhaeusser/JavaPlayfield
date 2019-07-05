package de.mhaeusser.java8.lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaTest1 {

    public static void main(String[] args) {
        TimesFunction times = (x, y) -> x + y;
        TimesFunction timesVar = times;
        assertThat(timesVar.eval(3, 5), is(8));
    }

    interface TimesFunction { int eval(int x, int y); }
}
