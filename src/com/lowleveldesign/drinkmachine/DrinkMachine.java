package com.lowleveldesign.drinkmachine;

import java.util.*;
import static com.lowleveldesign.drinkmachine.Ingredient.*;
import static com.lowleveldesign.drinkmachine.Drink.addDrinks;
import static java.lang.Integer.parseInt;

public class DrinkMachine implements Constants {
	List<Drink> drinkList;
	public final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		DrinkMachine machine = initializeDrinkMachine();
		machine.start();
		machine.end();
	}

	private static DrinkMachine initializeDrinkMachine() {
		return new DrinkMachine(addDrinks());
	}

	public DrinkMachine(List<Drink> drinkList) {
		this.drinkList = drinkList;
	}

	private void start() {

		if (drinkList.size() == 0 || allAvailableIngredients.size() == 0) {
			System.out.println(noDrinks);
			end();
		}

		display();

		while (true) {
			String input = scanner.nextLine().toLowerCase().trim();

			if (input.trim().equals(""))
				continue;
			else if (input.equals("r"))
				reStock();
			else if (input.equals("q"))
				break;
			else
				try {
					dispensing(drinkList.get(parseInt(input) - 1));
				} catch (NumberFormatException | IndexOutOfBoundsException e) {
					System.out.println(tryAgain);
				}
		}
	}

	private void dispensing(Drink drink) {

		boolean available = false;

		for (Ingredient ingredient : drink.getListIngredients())
			if (ingredient.getQuantitiy() > getIngredient(allAvailableIngredients, ingredient.getName()).getStock()) {
				available = false;
				break;
			} else {
				getIngredient(allAvailableIngredients, ingredient.getName()).updateStock(ingredient.getQuantitiy());
				available = true;
			}

		if (available)
			System.out.println(drink.getName() + "  " + dispensing);
		else
			System.out.println(drink.getName() + "  " + unable2Dispensing);

	}

	private void display() {
		int count = 0;

		System.out.println(welcome);

		for (Drink d : drinkList)
			System.out.println(++count + ":- " + d.getName() + " : $" + d.getPrice());

		System.out.println();
		System.out.println(restock);
		System.out.println(quit);
		System.out.println(line);

		System.out.println(inputString);

		System.out.println();

	}

	private void end() {
		System.out.println(goodBye);
		System.exit(0);
	}

}