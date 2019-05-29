package de.mhaeusser.designpatterns.prototype;

/** from https://en.wikipedia.org/wiki/Prototype_pattern#Java_Example */
public abstract class Prototype implements Cloneable {
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}
