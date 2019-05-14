package de.mhaeusser.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static final String SEPARATOR = ";";

    public static void main(String[] args) {
        String text = "1;2;3";
        List<Integer> ints = readServiceIdentifiers(text);
        for (Integer i : ints) {
            System.out.println(i);
        }
    }

    private static List<Integer> readServiceIdentifiers(final String text) {
        List<String> serviceIds = Arrays.asList(text.split(SEPARATOR));
        List<Integer> list = new ArrayList<>();

        serviceIds.forEach(sid -> {
            list.add(Integer.parseInt(sid.trim()));
        });
        return list;
    }
}
