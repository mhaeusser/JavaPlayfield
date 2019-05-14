package de.mhaeusser.java8.streams.inaction;

public class Dish {

	private String name;
	private int weight;
	private int calories;

	public Dish(String name, int weight, int calories) {
		this.name = name;
		this.weight = weight;
		this.calories = calories;
	}
	
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getCalories() {
		return calories;
	}
}
