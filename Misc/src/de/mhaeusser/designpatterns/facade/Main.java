package de.mhaeusser.designpatterns.facade;

/** from https://en.wikipedia.org/wiki/Facade_pattern#Java */
class Main {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
