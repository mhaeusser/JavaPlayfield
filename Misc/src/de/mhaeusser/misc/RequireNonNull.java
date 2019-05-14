package de.mhaeusser.misc;

import java.util.Objects;

public class RequireNonNull {

    public static void main(String[] args) {
    	System.out.println(check("Hello"));
    	System.out.println(check(null));
    }

    public static String check(String string) {
        Objects.requireNonNull(string);
        return string;
    }
}
