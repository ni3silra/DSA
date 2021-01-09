/*
 * Given an array of integers A, find and return the minimum elements to be removed such that in the resulting array the sum of any two adjacent values is even.
 */

package com.problemsolving;

public class AdjacentValueSumIsEven {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int[] B = { 5, 17, 100, 11 };
		System.out.println(new AdjacentValueSumIsEven().solve(B));
	}

	public int solve(int[] A) {
		int oddCount = 0;
		int evenCount = 0;

		for (int i : A)
			if (i % 2 == 0)
				evenCount++;
			else
				oddCount++;

		return evenCount < oddCount ? evenCount : oddCount;
	}

}
