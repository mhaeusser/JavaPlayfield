package de.mhaeusser.designpatterns.composite;

/** from https://en.wikipedia.org/wiki/Composite_pattern#Java */
/** Client */
public class CompositeDemo {
    public static void main(String[] args) {
        // initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        // create two composites containing the ellipses
        CompositeGraphic graphic2 = new CompositeGraphic();
        graphic2.add(ellipse1);
        graphic2.add(ellipse2);
        graphic2.add(ellipse3);
        
        CompositeGraphic graphic3 = new CompositeGraphic();
        graphic3.add(ellipse4);
        
        // create another graphics that contains two graphics
        CompositeGraphic graphic1 = new CompositeGraphic();
        graphic1.add(graphic2);
        graphic1.add(graphic3);

        // print the complete graphic (four times the string "Ellipse")
        graphic1.print();
    }
}
