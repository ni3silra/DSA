package com.lowleveldesign.drinkmachine;

public interface Constants {

	// Print strings
	String welcome = "=========WELCOME TO DRINK MACHINE============";
	String line = "=============================================";
	String restock = "R/r :- Restock Ingredients";
	String quit = "Q/q :- Quit";
	String inputString = "Choose Your Drink : ";
	String restocking = "Restock done...";
	String dispensing = "Dispensing...";
	String unable2Dispensing = "Unable to Dispance...!!! Out of stock" + "\n" + "Try restock";
	String goodBye = "Good Bye...";
	String tryAgain = "Please try again...";
	String noDrinks = "Oops.. No Drinks Available";

	// Ingredients and Drink Name
	String coffee = "Coffee";
	String sugar = "Sugar";
	String cream = "Cream";
	String steamedMilk = "Steamed Milk";
	String foamedMilk = "Foamed Milk";
	String espresso = "Espresso";
	String cocoa = "Cocoa";
	String whippedCream = "Whipped Cream";
	public static final int totalStock = 10;

}
