package de.mhaeusser.designpatterns.visitor;

/** from https://en.wikipedia.org/wiki/Visitor_pattern#Java_example */
public class VisitorDemo {
    public static void main(final String[] args) {
        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
