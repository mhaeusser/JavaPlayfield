package de.mhaeusser.designpatterns.abstractfactory;

import java.util.List;
import java.util.Random;

/* from https://en.wikipedia.org/wiki/Abstract_factory_pattern#Java_example */
interface Button {
    void paint();
}

class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}

class OSXButton implements Button {
    @Override
    public void paint() {
        System.out.println("OSXButton");
    }
}

public class AbstractFactoryExample {
    // abstract the way to create a button
    @FunctionalInterface
    interface GUIFactory {
        public Button createButton();
    }

    private static GUIFactory factory(String appearance) {
        switch(appearance) {
            case "osx":
                return OSXButton::new;
            case "win":
                return WinButton::new;
            default:
                throw new IllegalArgumentException("unknown " + appearance);
        }
    }

    public static void main(final String[] arguments) {
        // This is just for the sake of testing this program,
        // and doesn't have to do with the Abstract Factory pattern.
        var randomAppearance = List.of("osx", "win").get(new Random().nextInt(2));

        // get the button factory for an appearance
        var factory = factory(randomAppearance);

        // use the factory to create the button
        var button = factory.createButton();
        button.paint();
    }
}
