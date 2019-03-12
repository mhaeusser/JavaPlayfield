package de.mhaeusser.annotations;

// see https://stackoverflow.com/questions/918393/whats-the-difference-between-interface-and-interface-in-java

@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}

@ClassPreamble(author = "John Doe", date = "2019-02-26", currentRevision=2, reviewers = { "Tarzan", "Jane" })
public class SomeClass {
}
