package de.mhaeusser.java8.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinLesson {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        String str1 = Arrays.toString(list.toArray());
        System.out.println(str1);

        String str2 = String.join(", ", list);
        System.out.println(str2);
    }
}
