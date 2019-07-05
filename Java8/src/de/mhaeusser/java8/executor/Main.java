package de.mhaeusser.java8.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int NUM_THREADS = 10;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
        for (int i = 0; i < 500; i++) {
            Runnable worker = new MyRunnable(10000000L + i);
            executorService.execute(worker);
        }
        // This makes the executor accept no new threads
        // and finishes all existing threads in the queue
        executorService.shutdown();
        // Wait until all threads are finished

        // TODO if the timeout occurs (e.g. for 1 second), there is no more output!
        boolean inTime = executorService.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Finished all threads " + (inTime ? "in time." : "not in time."));
    }
}
