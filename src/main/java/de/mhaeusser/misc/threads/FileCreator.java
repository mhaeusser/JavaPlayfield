package de.mhaeusser.misc.threads;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public abstract class FileCreator {

    abstract String getPrefix();
    
    abstract List<File> createFiles(int numFiles, int numThreads) throws IOException, ExecutionException, InterruptedException;

    public static File createFile(String prefix, int fileIndex, int threadIndex) throws IOException {
        File file = File.createTempFile(prefix + "_f" + fileIndex + "_t" + threadIndex + "_", ".test");
        System.out.println(String.format("Created file %s (thread index %s): %s", fileIndex, threadIndex, file.getAbsolutePath()));
        return file;
    }
    
    public List<File> createTheFiles(int numFiles, int threadIndex) throws IOException {
        List<File> files = new ArrayList<>();
        for (int i = 0; i < numFiles; i++) {
            File file = createFile(getPrefix(), i, threadIndex);
            files.add(file);
        }
        return files;
    }
}
