package de.mhaeusser.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

// see http://docs.oracle.com/javase/tutorial/java/annotations/declaring.html

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

    public static void main(String[] args) {
    	Annotation[] annotations = new SomeClass().getClass().getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
