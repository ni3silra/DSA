package com.problemsolving.math;

public class TrailingZeroesInFactorial {

	public static void main(String[] args) {
		int ans = new TrailingZeroesInFactorial().getTrailingZeroesOptimal(125);
		System.out.println(ans);
	}

	// Brute Force
	public int getTrailingZeroes(int num) {
		// get factorial
		long fact = 1;

		while (num > 0)
			fact *= num--;
		System.out.println("Fact Computed");
		// check if factorial value is divisible by 10 and count each time
		int count = 0;
		while (fact % 10 == 0) {
			count++;
			fact /= 10;
			System.out.println("Count Computing...");
		}
		
		System.out.println("Count Computed");
		return count;
	} // can lead to Not in range for data type TC (n(n+1)/2) -> O(n^2)
	
	// power of 5 available in num is equal to trailing to zero
	public int getTrailingZeroesOptimal(int num) {
		int count = 0;

		for (int i = 5; i <= num; i = i * 5) {
				count+=num/i;
		}

		return count;
	} // log(n) base 5;

}
