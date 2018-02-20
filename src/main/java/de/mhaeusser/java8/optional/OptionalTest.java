package de.mhaeusser.java8.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        for (int i=0; i <= 3; i++) {
            go(i);
        }
    }

    public static void go(int type) {

        Optional<String> name = getName(type);

        // A
        if (name.isPresent()) {
            System.out.println("(A" + type + ") The name is " + name.get());
        }
        else {
            System.out.println("(A" + type + ") No name provided.");
        }

        // B
        String theName = getName(type).orElse("dummy");
        System.out.println("(B" + type + ") " + theName);

        // C
        name.ifPresent(x -> System.out.println("(C" + type + ") present"));

        System.out.println();
    }

    public static Optional<String> getName(int type) {
        if (type == 0) return Optional.of("Friedrich");

        if (type == 1) return Optional.ofNullable(null);

        if (type == 2) return Optional.ofNullable("Bernd");

        // type == 3
        return Optional.empty();
    }
}
