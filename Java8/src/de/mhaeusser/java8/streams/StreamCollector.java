package de.mhaeusser.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollector {

    static String joinLists(final List<String> firstList, final List<String> secondList) {
        final Set<String> joinedList = new HashSet<>();
        if (firstList != null && !firstList.isEmpty()) {
            joinedList.addAll(firstList.stream().map(header -> header.split(",")).flatMap(Arrays::stream)
                    .collect(Collectors.toSet()));
        }
        joinedList.addAll(secondList);
        return joinedList.stream().collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<String> firstList = Arrays.asList("a, 1", "h12", "h3");
        List<String> secondList = Arrays.asList("d1", "d12", "d,3", "d4");
        System.out.println(joinLists(firstList, secondList));
    }
}
