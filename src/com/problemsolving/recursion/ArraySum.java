package com.problemsolving.recursion;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println(new ArraySum().getSum(new int[] { 1, 2, 3, 4 }));
	}

	public int getSum(int[] A) {
		return recursiveSum(A, 0, A.length);
	}

	private int recursiveSum(int[] A, int n) {

		if (n <= 0)
			return 0;

		return A[n - 1] + recursiveSum(A, n - 1);
	}

	private int recursiveSum(int[] A, int st, int n) {

		if (st == n - 1)
			return A[n - 1];

		return A[st] + recursiveSum(A, st + 1, n);
	}

}
