package de.mhaeusser.threads;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// this solution does not work
public class FileCreatorWithThreads extends FileCreator {

    @Override
    String getPrefix() {
        return "threads";
    }

    @Override
    List<File> createFiles(int numFiles, int numThreads) throws IOException, ExecutionException, InterruptedException {
        List<File> files = new ArrayList<File>();

        ArrayList<Future<File>> allFutureFiles = new ArrayList<Future<File>>();
        for (int i = 0; i < numThreads; i++) {
            List<Future<File>> Files = createFilesInThread(numFiles, i);
            allFutureFiles.addAll(Files);
        }

        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
        }

        System.out.println("Num files: " + allFutureFiles.size());

        for (Future<File> fname : allFutureFiles) {
            System.out.println(fname.isDone());
            File file = fname.get();
            files.add(file);
        }
        return files;
    }

    public List<Future<File>> createFilesInThread(int numFiles, int threadIndex) throws IOException {
        List<Future<File>> futureFiles = new ArrayList<>();
        new Thread(() -> {
            List<File> files = null;
            try {
                files = createTheFiles(numFiles, threadIndex);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (File file : files) {
                CompletableFuture<File> futureFile = new CompletableFuture<>();
                futureFile.complete(file);
                futureFiles.add(futureFile);
            }
        }).start();
        return futureFiles;
    }
}
