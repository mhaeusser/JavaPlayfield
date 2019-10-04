package de.mhaeusser.misc;

public class Underscores {

    public static void main(String[] args) {

        // legal:
        double d1 = 1234.56;

        double d2 = 1_234.56;

        double d3 = 0_1234.5_6;

        double d6 = 1_234_56; // but test said it was illegal...

        // illegal:
        //double d4 = _1234.56;
        //double d5 = 1_234_.56;
        //double d7 = 0_1234._56;
    }
}
