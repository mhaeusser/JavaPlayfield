package de.mhaeusser.java8.lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterTest {

    public static List<Person> initPersonen() {
        List<Person> personen = new ArrayList<Person>();
        Person p1 = new Person("John", "Doe", 28, "70771", "Leinfelden");
        personen.add(p1);
        Person p2 = new Person("Jane", "Doe", 40, "70199", "Stuttgart");
        personen.add(p2);
        Person p3 = new Person("Jim", "Smith", 32, "70190", "Stuttgart");
        personen.add(p3);
        Person p4 = new Person("Wayne", "Schlegel", 50, "70191", "Stuttgart");
        personen.add(p4);
        return personen;
    }

    public interface Filter<T> {
        boolean istErfuellt(T e);
    }

    public <T> List<T> filtern(List<T> liste, Filter<T> filter) {
        List<T> treffer = new ArrayList<T>();
        for (T e : liste) {
            if (filter.istErfuellt(e)) {
                treffer.add(e);
            }
        }
        return treffer;
    }

    public static void main(String[] args) {
        LambdaFilterTest runner = new LambdaFilterTest();
        runner.go();
    }

    public void go() {
        List<Person> personen = initPersonen();

        System.out.println("Alle: " + Arrays.asList(personen));

        filterClassic(personen);
        filterLambda(personen);
        filterStream(personen);
        filterStreamSort(personen);
    }

    public void filterClassic(List<Person> personen) {
        List<Person> treffer = filtern(personen, p -> p.getAlter() >= 30);

        System.out.println("Classic: " + Arrays.asList(treffer));
    }

    public void filterLambda(List<Person> personen) {
        List<Person> treffer = filtern(personen, p -> p.getAlter() >= 30);

        System.out.println("Lambda : " + Arrays.asList(treffer));
    }

    public void filterStream(List<Person> personen) {
        List<Person> treffer = personen.stream().filter(p -> p.getAlter() >= 30).collect(Collectors.toList());

        System.out.println("Stream : " + Arrays.asList(treffer));
    }

    public void filterStreamSort(List<Person> personen) {
        List<String> namen = personen.stream().filter(p -> p.getAlter() >= 30)
                .sorted(Comparator.comparingInt(Person::getAlter))
                .map(Person::getNachname)
                .collect(Collectors.toList());

        System.out.println("Stream : " + Arrays.asList(namen));
    }
}
