package com.problemsolving.sorting;

public class Array3Pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimize(final int[] A, final int[] B, final int[] C) {

		int min = Integer.MAX_VALUE;

		int a = 0;
		int b = 0;
		int c = 0;

		while (a < A.length && b < B.length && c < C.length) {
			int newMin = Math.max(Math.max(Math.abs(A[a] - B[b]), Math.abs(B[b] - C[c])), Math.abs(C[c] - A[a]));

			min = newMin < min ? newMin : min;

			if (A[a] <= B[b] && A[a] <= C[c]) {
				a++;
			} else if (B[b] <= C[c] && B[b] <= A[a]) {
				b++;
			} else if (C[c] <= A[a] && C[c] <= B[b]) {
				c++;
			}
		}

		return min;
	}

}
