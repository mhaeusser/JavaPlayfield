package de.mhaeusser.threads;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ThreadTest {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        new ThreadTest().runTest(3, 4);
    }
    
    /**
     * Runs the actual test.
     *
     * @param numFiles   Number of files to be added/changed within one thread (min: 1; max: 1000)
     * @param numThreads Number of threads (to increase parallelism) that are adding/changing files (min: 1, max: 100)
     */
    public void runTest(int numFiles, int numThreads) throws IOException, ExecutionException, InterruptedException {
        LocalDateTime testStartedAt = LocalDateTime.now();

        FileCreator fileCreator;
        
        // TODO change to thread variant
        //fileCreator = new FileCreatorNoThreads();
        //fileCreator = new FileCreatorWithThreads();
        fileCreator = new FileCreatorFixedPool();

        List<File> files = fileCreator.createFiles(numFiles, numThreads);

        LocalDateTime testEndedAt = LocalDateTime.now();

        Summary summary = new Summary(testStartedAt, testEndedAt, numThreads, numFiles, files);

        System.out.println("************************** TEST SUMMARY **************************");
        System.out.println(summary.getDescription());
        System.out.println("*********************** END OF TEST SUMMARY **********************");
    }
}
