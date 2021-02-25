package de.mhaeusser.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterTest {

  static List<String> longList = List.of("1", "2", "3", "4", "5");

  static Entry hasOne = new Entry(List.of("2"), List.of("zwei"));
  static Entry hasTwo = new Entry(List.of("4", "5"), List.of("vier", "fünf"));
  static Entry hasOther = new Entry(List.of("6", "7"), List.of("sechs", "sieben"));
  static Entry hasOneYesOneNo = new Entry(List.of("3", "7"), List.of("drei", "sieben"));

  static List<Entry> entries = List.of(hasOne, hasTwo, hasOther, hasOneYesOneNo);

  public static void main(String[] args) {
    testOld();
    testNew();
  }

  public static void testOld() {
    List<String> names = new ArrayList<>();

    for (Entry entry : entries) {
      List<String> codes = entry.getCodes();
      if (longList.containsAll(codes)) {
        names.addAll(entry.getNames());
        System.out.println(longList + " contains " + entry.getNames());
      } else {
        System.out.println(longList + " does not contain " + entry.getNames());
      }
    }

    System.out.println(names);
  }

  public static void testNew() {
    List<String> names = new ArrayList<>();

    entries.stream()
        .filter(e -> longList.containsAll(e.getCodes()))
        .map(e -> e.getNames())
        .forEach(names::addAll);
    System.out.println(names);
  }
}
