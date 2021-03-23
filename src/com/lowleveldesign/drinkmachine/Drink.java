package com.lowleveldesign.drinkmachine;

import java.util.*;

import static com.lowleveldesign.drinkmachine.Ingredient.*;

public class Drink implements Comparable<Drink>, Constants {

	String name;
	double price;
	List<Ingredient> listIngredientsForDrink;

	public Drink(String name, List<Ingredient> listIngredients) {
		this.name = name;
		this.listIngredientsForDrink = listIngredients;
		calculatePrice();
	}

	private void calculatePrice() {
		double price = 0;

		for (Ingredient ingredient : listIngredientsForDrink)
			price += ingredient.getCost() * ingredient.getQuantitiy();

		setPrice(price);
	}

	public static Drink makeDrink(String name, List<Ingredient> listIngredients) {
		return new Drink(name, listIngredients);
	}

	@Override
	public int compareTo(Drink o) {
		return o.name.compareTo(this.name);
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	public List<Ingredient> getListIngredients() {
		return listIngredientsForDrink;
	}

	public static Drink getDrink(List<Drink> listDrink, String name) {
		for (Drink d : listDrink)
			if (name.equals(d.getName()))
				return d;
		return null;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + ", listIngredients=" + listIngredientsForDrink + "]";
	}

	public static List<Drink> addDrinks() {
		List<Drink> drinkList = new ArrayList<Drink>();

		List<Ingredient> list1 = new ArrayList<>();

		list1.add(getIngredient(allAvailableIngredients, coffee).setQuantitiy(3));
		list1.add(getIngredient(allAvailableIngredients, sugar).setQuantitiy(2));
		list1.add(getIngredient(allAvailableIngredients, cream).setQuantitiy(1));
		drinkList.add(makeDrink(coffee, list1));

		List<Ingredient> list2 = new ArrayList<>();

		list2.add(getIngredient(allAvailableIngredients, espresso).setQuantitiy(3));
		list2.add(getIngredient(allAvailableIngredients, foamedMilk).setQuantitiy(2));
		list2.add(getIngredient(allAvailableIngredients, whippedCream).setQuantitiy(1));
		list2.add(getIngredient(allAvailableIngredients, sugar).setQuantitiy(2));
		drinkList.add(makeDrink(espresso, list2));

		List<Ingredient> list3 = new ArrayList<>();

		list3.add(getIngredient(allAvailableIngredients, cocoa).setQuantitiy(3));
		list3.add(getIngredient(allAvailableIngredients, sugar).setQuantitiy(2));
		list3.add(getIngredient(allAvailableIngredients, steamedMilk).setQuantitiy(2));
		list3.add(getIngredient(allAvailableIngredients, cream).setQuantitiy(1));
		drinkList.add(makeDrink(cocoa, list3));

		Collections.sort(drinkList);

		return drinkList;
	}

}