package de.mhaeusser.designpatterns.flyweight;

/** from https://en.wikipedia.org/wiki/Flyweight_pattern */
@FunctionalInterface
interface Order {
    void serve();

    static Order of(String flavourName, int tableNumber) {
        var flavour = CoffeeFlavour.intern(flavourName);
        return () -> System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
