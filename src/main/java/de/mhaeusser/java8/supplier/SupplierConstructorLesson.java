package de.mhaeusser.java8.supplier;

import java.util.function.Supplier;

public class SupplierConstructorLesson {

    public static void main(String[] args) {
        System.out.println(maker(Employee::new));
    }

    private static Employee maker(Supplier<Employee> fx) {
        return fx.get();
    }
}

class Employee {
    @Override
    public String toString() {
        return "An Employee";
    }
}
