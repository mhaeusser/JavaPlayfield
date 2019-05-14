package de.mhaeusser.threads;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FileCreatorFixedPool extends FileCreator {

    @Override
    String getPrefix() {
        return "pool";
    }

    @Override
    List<File> createFiles(int numFiles, int numThreads) throws IOException, ExecutionException, InterruptedException {
        List<File> allFiles = new ArrayList<File>();

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<List<File>>> list = new ArrayList<Future<List<File>>>();
        for (int i = 0; i < numThreads; i++) {
            Callable<List<File>> worker = new FixedPoolCallable(numFiles, i);
            Future<List<File>> submit = executor.submit(worker);
            list.add(submit);
        }
        System.out.println(list.size());
        // now retrieve the result
        for (Future<List<File>> future : list) {
            try {
                List<File> files = future.get();
                allFiles.addAll(files);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        return allFiles;
    }
}
