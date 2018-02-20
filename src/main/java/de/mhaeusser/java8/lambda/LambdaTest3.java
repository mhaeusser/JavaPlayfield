package de.mhaeusser.java8.lambda;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

public class LambdaTest3 {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(() -> {
            System.out.println("Hello again.");
            System.out.println("Du, ich möchte Dich heut noch seh'n.");
        });
    }
}
