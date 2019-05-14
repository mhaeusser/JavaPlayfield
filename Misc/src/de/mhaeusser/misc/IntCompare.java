package de.mhaeusser.misc;

public class IntCompare {

    public static void main(String[] args) {

        int a = 1000, b = 1000;
        System.out.println(a == b); // true

        Integer c = 1000, d = 1000;
        System.out.println(c == d); // false

        Integer e = 100, f = 100;
        System.out.println(e == f); // true

        Integer g = 127, h = 127;
        System.out.println(g == h); // true

        Integer i = 128, j = 128;
        System.out.println(i == j); // false

        // Integer caching between -128 and 127
        // see https://blog.urma.com/
    }
}
