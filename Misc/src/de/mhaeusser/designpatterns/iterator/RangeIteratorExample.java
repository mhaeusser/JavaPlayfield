package de.mhaeusser.designpatterns.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/** from https://en.wikipedia.org/wiki/Iterator_pattern#Java */
public class RangeIteratorExample {
    public static Iterator<Integer> range(int start, int end) {
        return new Iterator<>() {
            private int index = start;
      
            @Override
            public boolean hasNext() {
                return index < end;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return index++;
            }
        };
    }
    
    public static void main(String[] args) {
        var iterator = range(0, 10);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // or using a lambda
        iterator = range(0, 10);
        iterator.forEachRemaining(System.out::println);
    }
}
