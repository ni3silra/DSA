package com.utilites;

import java.util.*;

public class Test {

	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please Enter a Number");
		int input = 0;
		try {
			input = scanner.nextInt();
		} catch (NumberFormatException nfe) {
			System.out.println("Please Try Again ");
			main(args);
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
			System.exit(0);
		}
		System.out.println("Input " + input + " is Palindrome :" + checkPal(input));

		System.out.println(calculateCountOfWords("MONDAY TUESDAY FRIDAY MONDAY FRIDAY"));
	}

	private static boolean checkPal(int input) {
		int tempInt = input;
		int reverseInt = 0;

		while (tempInt > 0) {
			int digit = tempInt % 10;
			reverseInt = reverseInt * 10 + digit;
			tempInt /= 10;
		}

		if (input == reverseInt)
			return true;
		return false;
	}

	public static HashMap<String, Integer> calculateCountOfWords(String input) {
		String[] words = input.split(" ");
		HashMap<String, Integer> countMap = new HashMap<>();

		for (String w : words)
			if (countMap.get(w) == null)
				countMap.put(w, 1);
			else
				countMap.put(w, countMap.get(w) + 1);

		for (String s : countMap.keySet())
			System.out.println("Key : " + s + "   Value :-" + countMap.get(s));

		return countMap;
	}

}

class MyException extends Exception {

	MyException(String msg) {
		super(msg);
	}

}
