/*
 * How to find the missing number in integer array of 1 to 100?
 */

package com.problemsolving;

public class MissingNumber {

	int from = 0;
	int to = 10;

	public int find(int[] array) {

		int sum = to * (to + 1) / 2;
		int arraySum = 0;

		for (int i : array)
			arraySum += i;

		return sum - arraySum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 9, 5, 6, 7, 8, 10 };
		MissingNumber missingNumber = new MissingNumber();
		System.out.println(missingNumber.find(array));
	}

}
