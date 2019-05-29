package de.mhaeusser.designpatterns.singleton;

public enum SingletonEnum {

    INSTANCE;

    // Modifier 'private' is redundant for enum constructors.
    SingletonEnum() {
    }

    public void dostuff() {
    }
}
