package com.problemsolving.math;

public class AlternatePrimeNumber {

	public static void main(String[] args) {
		new AlternatePrimeNumber().alternatePrimeNumber(3, 11);
	}

	public void alternatePrimeNumber(int num1, int num2) {
		int alterateIndicator = 0;
		for (int i = num1; i <= num2; i++)
			if (isPrime(i) && alterateIndicator++ % 2 == 0)
				System.out.println(i);
	}

	public boolean isPrime(int number) {
		int numOfDiveisble = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				numOfDiveisble++;
			if (numOfDiveisble > 2)
				return false;
		}
		return true;
	}

}
