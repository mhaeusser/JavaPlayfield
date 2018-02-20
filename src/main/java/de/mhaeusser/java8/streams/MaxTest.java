package de.mhaeusser.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxTest {

	public static void main(String[] args) {
		List<Thing> things = Arrays.asList(new Thing(1), new Thing(-1), new Thing(100), new Thing(42), new Thing(37));
		
		OptionalInt max = things
				.stream()
				.mapToInt(Thing::getWeight)
				.max();
		
		System.out.println(max.getAsInt());
	}
}
