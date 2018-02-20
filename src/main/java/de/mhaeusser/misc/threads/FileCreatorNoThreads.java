package de.mhaeusser.misc.threads;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCreatorNoThreads extends FileCreator {
    
    @Override
    String getPrefix() {
        return "nothreads";
    }

    /**
     * Creates numFiles * numThreads files.
     * @param numFiles
     * @param numThreads
     */
    @Override
    List<File> createFiles(int numFiles, int numThreads) throws IOException {
        List<File> allFiles = new ArrayList<File>();
        for (int threadIndex = 0; threadIndex < numThreads; threadIndex++) {
            List<File> files = createTheFiles(numFiles, threadIndex);
            allFiles.addAll(files);
        }
        return allFiles;
    }
}
