package de.mhaeusser.designpatterns.factorymethod;

/** from https://en.wikipedia.org/wiki/Factory_method_pattern#Java */
public class Main {

    public static void main(String[] args) {

        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
    }
}
