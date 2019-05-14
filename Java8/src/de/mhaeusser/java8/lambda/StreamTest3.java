package de.mhaeusser.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest3 {
    public static void main(String[] args) {
    	final List<Integer> ints = Arrays.asList(10, 15, 20, 25, 30, 45, 50);
    	System.out.println(Arrays.toString(ints.stream().map(i -> i).toArray()));
		
        System.out.println(Arrays.toString(IntStream.range(0, 5).parallel().map(x -> x*2).toArray()));
        System.out.println(Arrays.toString(IntStream.range(0, 5).map(x -> x*2).toArray()));
    }
}
