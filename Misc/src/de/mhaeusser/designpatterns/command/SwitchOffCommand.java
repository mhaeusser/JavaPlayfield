package de.mhaeusser.designpatterns.command;

/** The Command for switching off the light */
class SwitchOffCommand implements Command {
    private final Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }

    @Override // Command
    public void execute() {
        light.switchOff();
    }
}
