package de.mhaeusser.designpatterns.singleton;

public class SingletonEarly {

    // thread safe by initializing the instance during class loading
    private static SingletonEarly instance = new SingletonEarly();

    private SingletonEarly() {}

    public static SingletonEarly getInstance() {
        return instance;
    }
}
