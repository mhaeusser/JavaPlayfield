package de.mhaeusser.designpatterns.singleton;

/** From https://en.wikipedia.org/wiki/Singleton_pattern#Lazy_initialization,
    thread-safe implementation using lazy initialization with double-checked locking */
public final class SingletonThreadsafe {

    private static volatile SingletonThreadsafe instance = null;

    private SingletonThreadsafe() {}

    public static SingletonThreadsafe getInstance() {
        if (instance == null) {
            synchronized(SingletonThreadsafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadsafe();
                }
            }
        }

        return instance;
    }
}
