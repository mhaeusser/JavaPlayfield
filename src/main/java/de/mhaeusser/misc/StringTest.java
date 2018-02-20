package de.mhaeusser.misc;

public class StringTest {

    public static void changeString(String string) {
        string = "changed";
	}

    public static void main(String[] args) {
        String string = "string";
        changeString(string);
        System.out.println(string);
    }
}
