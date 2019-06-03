package de.mhaeusser.designpatterns.observer;

/** from https://en.wikipedia.org/wiki/Observer_pattern#Java */
public class ObserverDemo {

    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        var eventSource = new EventSource();

        eventSource.addObserver(event -> {
            System.out.println("Received response: " + event);
        });

        eventSource.scanSystemIn();
    }
}
