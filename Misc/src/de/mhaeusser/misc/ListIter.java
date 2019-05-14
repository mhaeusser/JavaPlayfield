package de.mhaeusser.misc;

import java.util.Arrays;
import java.util.List;

public class ListIter {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2");
        printItems(list);

        list = null;
        printItems(list);
    }

    public static void printItems(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
