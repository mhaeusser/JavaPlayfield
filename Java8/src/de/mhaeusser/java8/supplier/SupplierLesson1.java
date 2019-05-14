package de.mhaeusser.java8.supplier;

import java.util.function.Supplier;

public class SupplierLesson1 {

    public static void main(String[] args) {
        Supplier<String> i  = () -> "java2s.com";
        System.out.println(i.get());        
    }
}
