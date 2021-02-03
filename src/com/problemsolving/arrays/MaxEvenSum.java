package com.problemsolving.arrays;

public class MaxEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMaxEvenSum(int[] A) {
		int sum = 0;

		for (int i = 0; i < A.length; ++i) {
			sum += A[i];
		}

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
