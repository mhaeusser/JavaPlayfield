package de.mhaeusser.designpatterns.factorymethod;

public class OrdinaryMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom(); 
    }
}
