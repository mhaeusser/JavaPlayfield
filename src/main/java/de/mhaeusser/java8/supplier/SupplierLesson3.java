package de.mhaeusser.java8.supplier;

import java.util.function.Supplier;

public class SupplierLesson3 {

    public static void main(String[] args) {
        Supplier<Student> studentGenerator = SupplierLesson3::employeeMaker;

        for (int i = 0; i < 10; i++) {
            System.out.println("#" + i + ": " + studentGenerator.get());
        }
    }

    public static Student employeeMaker() {
        return new Student("A", 2);
    }
}

class Student {
    public String name;
    public double gpa;

    Student(String name, double g) {
        this.name = name;
        this.gpa = g;
    }

    @Override
    public String toString() {
        return name + ": " + gpa;
    }
}
