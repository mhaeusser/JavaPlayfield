package de.mhaeusser.designpatterns.flyweight;

import java.util.ArrayList;

/** from https://en.wikipedia.org/wiki/Flyweight_pattern */
class CoffeeShop {
    private final ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(String flavour, int tableNumber) {
        orders.add(Order.of(flavour, tableNumber));
    }

    public void service() {
        orders.forEach(Order::serve);
    }
}
