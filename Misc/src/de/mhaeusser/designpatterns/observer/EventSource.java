package de.mhaeusser.designpatterns.observer;

import java.util.ArrayList;
import java.util.Scanner;

class EventSource {

    public interface Observer {
        void update(String event);
    }

    private final ArrayList<Observer> observers = new ArrayList<>();

    private void notifyObservers(String event) {
        observers.forEach(observer -> observer.update(event));
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void scanSystemIn() {
        var scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            var line = scanner.nextLine();
            notifyObservers(line);
        }
    }
}
