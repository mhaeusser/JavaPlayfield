package de.mhaeusser.generics;

import org.junit.Test;

public class PairTest {

    @Test
    public void test() {
        // <> = diamond (angle brackets)
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
        // Java 7 and later: types can be inferred
        Pair<Integer, String> p3 = new OrderedPair<>(8, "Even");
        Pair<String, Integer>  p4 = new OrderedPair<>("hello", 37);

        System.out.println(p1.getValue());
        System.out.println(p1.getValue().getClass().getSimpleName());

        System.out.println(p2.getValue());
        System.out.println(p2.getValue().getClass().getSimpleName());

        System.out.println(p3.getKey());
        System.out.println(p3.getKey().getClass().getSimpleName());

        System.out.println(p4.getKey());
        System.out.println(p4.getKey().getClass().getSimpleName());

        boolean same1 = Util.<String, Integer>compare(p1, p4);
        boolean same2 = Util.compare(p1, p4);
        System.out.println(same1 == same2);
    }
}
