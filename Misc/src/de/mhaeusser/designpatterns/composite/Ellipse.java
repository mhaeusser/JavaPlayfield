package de.mhaeusser.designpatterns.composite;

/** "Leaf" */
class Ellipse implements Graphic {
    // prints the graphic
    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}
