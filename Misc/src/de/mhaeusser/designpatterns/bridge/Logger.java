package de.mhaeusser.designpatterns.bridge;

// Logger has two implementations: info and warning
interface Logger {
    void log(String message);

    static Logger info() {
        return message -> System.out.println("info: " + message);
    }

    static Logger warning() {
        return message -> System.out.println("warning: " + message);
    }
}
