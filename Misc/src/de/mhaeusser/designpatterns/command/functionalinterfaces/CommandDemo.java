package de.mhaeusser.designpatterns.command.functionalinterfaces;

/** from https://en.wikipedia.org/wiki/Command_pattern#Java */
public class CommandDemo {

    public static void main(final String[] arguments) {
        Light lamp = new Light();

        Command switchOn = lamp::switchOn;
        Command switchOff = lamp::switchOff;

        Switch mySwitch = new Switch();
        mySwitch.register("on", switchOn);
        mySwitch.register("off", switchOff);

        mySwitch.execute("on");
        mySwitch.execute("off");
    }
}
