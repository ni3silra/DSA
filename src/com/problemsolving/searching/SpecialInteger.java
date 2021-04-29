package com.problemsolving.searching;

import java.util.Arrays;

public class SpecialInteger {

	public static void main(String[] args) {
		System.out.println(new SpecialInteger().solve(new int[] { 1, 2, 3, 4, 5 }, 10));
	}

	public int solve(int[] A, int B) {
		int[] prefixSum = new int[A.length];

		prefixSum[0] = A[0];

		for (int i = 1; i < A.length; i++)
			prefixSum[i] = prefixSum[i - 1] + A[i];
		// System.out.println(Arrays.toString(prefixSum));
		int k = 1;

		for (int i = 0; i < k - 1; i++) {
			int num = prefixSum[i + k] - prefixSum[i];
			if (num <= B) {
				continue;
			} else {
				k--;
			}
		}

		return k;
	}

}
