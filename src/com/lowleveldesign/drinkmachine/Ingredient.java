package com.lowleveldesign.drinkmachine;

import java.util.ArrayList;
import java.util.List;

public class Ingredient implements Constants {

	public String name;
	private double cost;
	private int quantitiy;
	private int stock;
	static List<Ingredient> allAvailableIngredients;

	public static Ingredient createIngredient(String name, double cost) {
		return new Ingredient().setName(name).setCost(cost).setStock(totalStock).setQuantitiy(0);
	}

	public static Ingredient getIngredient(List<Ingredient> listIngredient, String name) {
		for (Ingredient i : listIngredient)
			if (name.equals(i.getName()))
				return i;
		return null;
	}

	private Ingredient setStock(int stock) {
		this.stock = stock;
		return this;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public int getStock() {
		return stock;
	}

	public int getQuantitiy() {
		return quantitiy;
	}

	public Ingredient updateStock(int quantitiy) {
		this.stock -= quantitiy;
		return this;
	}

	public Ingredient setQuantitiy(int quantitiy) {
		this.quantitiy = quantitiy;
		return this;
	}

	private Ingredient setName(String name) {
		this.name = name;
		return this;
	}

	private Ingredient setCost(double cost) {
		this.cost = cost;
		return this;
	}

	static {
		allAvailableIngredients = new Ingredient().addIngredients();
	}

	public static void reStock() {
		allAvailableIngredients = new Ingredient().addIngredients();
		System.out.println(restocking);
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", cost=" + cost + ", quantitiy=" + quantitiy + ", stock=" + stock + "]";
	}

	private List<Ingredient> addIngredients() {
		List<Ingredient> ingredientList = new ArrayList<Ingredient>();
		ingredientList.add(createIngredient(coffee, 0.75));
		ingredientList.add(createIngredient(sugar, 0.25));
		ingredientList.add(createIngredient(cream, 0.25));
		ingredientList.add(createIngredient(steamedMilk, 0.35));
		ingredientList.add(createIngredient(foamedMilk, 0.35));
		ingredientList.add(createIngredient(espresso, 1.10));
		ingredientList.add(createIngredient(cocoa, 0.90));
		ingredientList.add(createIngredient(whippedCream, 1.00));
		return ingredientList;
	}

}
