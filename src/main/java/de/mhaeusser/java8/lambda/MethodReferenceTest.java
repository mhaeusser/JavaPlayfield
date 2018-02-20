package de.mhaeusser.java8.lambda;

import java.util.function.IntBinaryOperator;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class MethodReferenceTest {

    public static void main(String[] args) {
        MethodReferenceTest.go1();

        MethodReferenceTest.go2();
    }

    static int staticTimes(int x, int y) {
        return x * y;
    }

    int times(int x, int y) {
        return x * y;
    }

    public static void go1() {
        IntBinaryOperator timesVar = MethodReferenceTest::staticTimes;
        assertThat(timesVar.applyAsInt(3, 5), is(15));
    }

    public static void go2() {
        MethodReferenceTest test = new MethodReferenceTest();
        IntBinaryOperator timesVar = test::times;
        assertThat(timesVar.applyAsInt(3, 5), is(15));
    }
}
