package de.mhaeusser.designpatterns.visitor;

interface CarElement {
    void accept(CarElementVisitor visitor);
}
