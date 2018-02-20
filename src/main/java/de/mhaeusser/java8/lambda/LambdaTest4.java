package de.mhaeusser.java8.lambda;

interface IntExecutable {
    int execute();
}

class IntRunner {
    public int run(IntExecutable e) {
        return e.execute();
    }
}

// see https://caveofprogramming.com/java/whats-new-in-java-8-lambda-expressions.html
public class LambdaTest4 {

    public static void main(String[] args) {
        IntRunner runner = new IntRunner();
        int t = runner.run(() -> {
            System.out.println("Hello again.");
            return 7;
        });
        System.out.println(t);

        t = runner.run(() -> 37);
        System.out.println(t);
    }
}
