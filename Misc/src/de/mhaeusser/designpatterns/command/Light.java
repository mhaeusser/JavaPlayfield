package de.mhaeusser.designpatterns.command;

/** The Receiver class */
class Light {
    public void switchOn() {
        System.out.println("The light is on.");
    }

    public void switchOff() {
        System.out.println("The light is off.");
    }
}
