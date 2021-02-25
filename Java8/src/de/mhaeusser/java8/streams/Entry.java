package de.mhaeusser.java8.streams;

import java.util.List;

public class Entry {

  List<String> codes;
  List<String> names;

  public Entry(List<String> codes, List<String> names) {
    this.codes = codes;
    this.names = names;
  }

  public List<String> getCodes() {
    return codes;
  }

  public List<String> getNames() {
    return names;
  }
}
