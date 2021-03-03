package de.mhaeusser.java8.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfTest {

    @Test
    public void removeIf() {
        List<String> languages = new ArrayList<>();
        languages.add("Clojure");
        languages.add("Scala");
        languages.add("C++");
        languages.add("Groovy");
        languages.add("Go");

        languages.removeIf(m -> m.length() > 4);

        System.out.println(languages);
    }
}
