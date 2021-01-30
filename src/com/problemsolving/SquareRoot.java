package com.problemsolving;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(findSquareRoot(370000000000000.0));
	}

	static int findSquareRoot(double number) {

		for (int i = 0; i <= number; i++) {

			if (i * i > number)
				break;

			if (i * i == number)
				return i;
		}
		return -1;
	}

}
