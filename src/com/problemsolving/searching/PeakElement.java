package com.problemsolving.searching;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(int[] A) {
		int n = A.length;
		for (int i = 1; i < n; i++) {

			if (i == 0) {
				if (A[i - 1] > A[i]) {
					return A[i];
				}
			} else if (i == n - 1) {
				if (A[i] >= A[i - 1]) {
					return A[i];
				}
			} else {
				if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
					return A[i];
				}
			}
		}

		return A[0];
	}

}
