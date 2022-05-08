package com.algorithms.recursion;

public class Fibonacci {

	int[] getFibonacciSeriesByIteration(int occurance) {
		int[] fibonacci = new int[occurance];

		// base case
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		// iterative case
		for (int i = 2; i < occurance; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		return fibonacci;
	} // O(n)

	int fib(int n) {
		if (n < 2)
			return n;
		return fib(--n) + fib(--n);
	} // O(2^n)

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();

		for (int i : fibonacci.getFibonacciSeriesByIteration(100))
			System.out.print(i + ", ");
		System.out.println("\nEnd Iterative :");
		System.out.println(fibonacci.fib(23));
	}

}
