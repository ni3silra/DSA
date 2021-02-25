package com.algorithms.recursion;

public class Factorial {
	static int calculations = 0;

	long getFactorialFromRecursion(int number) {

		if (number < 0) {
			System.out.println("Please Enter non Negative Number");
			return 0;
		}
		if (number == 0)
			return 1;

		return number * getFactorialFromRecursion(--number);
	} // O(n)

	long getFactorialFromIteration(int number) {
		long factorial = 1;
		calculations++;
		if (number < 0) {
			System.out.println("Please Enter non Negative Number");
			return 0;
		}

		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	} // O(n)

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("Recusive Output  " + factorial.getFactorialFromRecursion(50));
		System.out.println("Iterative Output " + factorial.getFactorialFromIteration(0));
		System.out.println("Calcualtions " + calculations);
	}

}
