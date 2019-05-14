package de.mhaeusser.threads;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

public class Summary {

    private String description;

    public Summary(LocalDateTime testStartedAt, LocalDateTime testEndedAt,
            int numThreads, int numFiles, List<File> files) {
        StringBuilder builder = new StringBuilder();
        builder.append("Run from ").append(testStartedAt.toString());
        builder.append(" until ").append(testEndedAt.toString()).append("\n");
        builder.append(numThreads).append(" threads created ").append(numFiles).append(" files each (");
        builder.append(files.size()).append(" in total.)\n");

        builder.append("Created files:\n");
        files.forEach(a -> {
            builder.append("Original name: ");
            builder.append(a.getAbsolutePath());
            builder.append("\n");
        });
        description = builder.toString();
    }

    public String getDescription() {
        return description;
    }
}
