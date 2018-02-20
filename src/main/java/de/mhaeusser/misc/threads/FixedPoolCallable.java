package de.mhaeusser.misc.threads;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class FixedPoolCallable implements Callable<List<File>> {

    private int numFiles;
    private int threadIndex;
    
    public FixedPoolCallable(int numFiles, int threadIndex) {
        this.numFiles = numFiles;
        this.threadIndex = threadIndex;
    }
    
    @Override
    public List<File> call() throws Exception {
        List<File> files = new ArrayList<>();
        for (int i = 0; i < numFiles; i++) {
            File file = FileCreator.createFile("pool", i, threadIndex);
            files.add(file);
        }
        return files;
    }
}