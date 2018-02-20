package de.mhaeusser.java8.lambda;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
    	final List<Integer> prices = Arrays.asList(10, 15, 20, 25, 30, 45, 50);
        
        addOldSchool(prices);
        
        addNewWithMap(prices);
        addNewWithMapToDouble(prices);
        addNewWithCollect(prices);
        addNewExperimental(prices);
    }

    public static void addOldSchool(List<Integer> prices) {
        double total = 0.0;
        for (int price : prices) {
            total += price * 0.9;
        }
        System.out.println("Total of discounted prices: " + total);
    }

    public static void addNewWithMap(List<Integer> prices) {
        final double numPrices = prices.stream().map((Integer price) -> price * 0.9).count();
        System.out.println("Number of discounted prices: " + numPrices);
    }

    public static void addNewWithMapToDouble(List<Integer> prices) {
        final double total = prices.stream().mapToDouble(i -> i.doubleValue() * 0.9).sum();
        System.out.println("Total of discounted prices: " + total);
    }

    public static void addNewWithCollect(List<Integer> prices) {
        final Integer total = prices.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Total of prices: " + total);
    }

    public static void addNewExperimental(List<Integer> prices) {
        final double total = prices.stream().map(i -> i).reduce(0, Integer::sum);
        System.out.println("Total of prices: " + total);
    }
}
