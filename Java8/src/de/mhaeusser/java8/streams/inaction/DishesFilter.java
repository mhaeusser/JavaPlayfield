package de.mhaeusser.java8.streams.inaction;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class DishesFilter {

	public static List<Dish> createDishes() {
		List<Dish> dishes = Arrays.asList(
				new Dish("One", 10, 2000),
				new Dish("Two", 12, 2200),
				new Dish("Chicken", 18, 2500) );
		return dishes;
	}
	
	public static void main(String[] args) {
		List<Dish> dishes = createDishes();
		
		List<String> names = dishes.stream()
				.filter(d -> {
					System.out.println("filtering " + d.getName());
					return d.getCalories() > 2000;
				})
				.map(d -> {
					System.out.println("mapping " + d.getName());
					return d.getName();
				})
				.limit(3)
				.collect(toList());
		System.out.println(names);
	}
}
