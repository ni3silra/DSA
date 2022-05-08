package com.problemsolving.arrays;

import java.util.Arrays;

public class MaxEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMaxEvenSum(int[] A) {
		int sum = Arrays.stream(A).sum();
		if (sum % 2 == 0) {
			return sum;
		}

		int smallestOdd = 0;




		for (int i = 0; i < A.length; ++i) {
			if (A[i] % 2 == 1)
				if (smallestOdd == 0 || A[i] < smallestOdd) {
					sum += smallestOdd;
					sum -= A[i];
					smallestOdd = A[i];
				}
		}

		return sum;
	}

}
