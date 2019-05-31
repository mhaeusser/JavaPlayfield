package de.mhaeusser.designpatterns.command;

/** The Command for switching on the light */
class SwitchOnCommand implements Command {
    private final Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override // Command
    public void execute() {
        light.switchOn();
    }
}
