package de.mhaeusser.designpatterns.singleton;

public final class SingletonClassic {

    private static SingletonClassic instance = null;

    private SingletonClassic() {}

    public static SingletonClassic getInstance() {
        if (instance == null) {
            instance = new SingletonClassic();
        }

        return instance;
    }
}
