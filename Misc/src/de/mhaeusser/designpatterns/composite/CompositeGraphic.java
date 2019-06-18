package de.mhaeusser.designpatterns.composite;

import java.util.ArrayList;

/** "Component" */
interface Graphic {
    // prints the graphic
    void print();
}

/** "Composite" */
class CompositeGraphic implements Graphic {
    // collection of child graphics
    private final ArrayList<Graphic> childGraphics = new ArrayList<>();

    // adds the graphic to the composition
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    // prints the graphic
    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print(); // delegation
        }
    }
}
