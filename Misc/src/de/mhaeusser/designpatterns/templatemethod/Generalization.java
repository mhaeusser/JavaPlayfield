package de.mhaeusser.designpatterns.templatemethod;

abstract class Generalization {
    // 1. Standardize the skeleton of an algorithm in a "template" method
    void findSolution() {
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
    }
    // 2. Common implementations of individual steps are defined in base class
    private void stepOne() {
        System.out.println("Generalization.stepOne");
    }
    // 3. Steps requiring peculiar implementations are "placeholders" in the base class
    abstract void stepTwo();
    abstract void stepThree();

    void stepFour() {
        System.out.println("Generalization.stepFour");
    }
}
