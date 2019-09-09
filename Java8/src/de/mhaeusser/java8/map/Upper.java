package de.mhaeusser.java8.map;

public class Upper {

    private String string;

    public Upper(String string) {
        this.string = string.toUpperCase();
    }

    @Override
    public String toString() {
        return string;
    }
}
