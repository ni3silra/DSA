package com.problemsolving.math;

import java.util.Arrays;

public class DeleteOne {

	public static void main(String[] args) {
		System.out.println(new DeleteOne().solve2(new int[] { 15, 18, 25, 20, 60 }));
		// 15,3,1,1,1
		// 1,1,5,20,60
	}

	public int solve(int[] A) {
		int n = A.length;
		int maxGcd = Integer.MIN_VALUE;

		for (int i = 0; i < n - 1; i++) {
			int getGcd = A[i + 1];
			for (int j = 0; j < n; j++) {
				if (j != i) {
					getGcd = gcd(A[j], getGcd);
				}
			}
			maxGcd = Math.max(maxGcd, getGcd);
		}
		return maxGcd != Integer.MIN_VALUE ? maxGcd : 1;
	}

	public int solve2(int[] A) {
		int n = A.length;
		int maxGcd = Integer.MIN_VALUE;

		int[] suffixArray = new int[n];
		suffixArray[n - 1] = A[n - 1];

		for (int i = n - 1; i > 0; i--) {
			suffixArray[i - 1] = gcd(A[i - 1], suffixArray[i]);
		}

		int[] prefixArray = new int[n];
		prefixArray[0] = A[0];

		for (int i = 0; i < n - 1; i++) {
			prefixArray[i + 1] = gcd(A[i + 1], prefixArray[i]);
		}

//		System.out.println(Arrays.toString(suffixArray));
//		System.out.println(Arrays.toString(prefixArray));

		for (int i = 0; i < n; i++) {
			int cuurGcd = 0;
			if (i == 0)
				cuurGcd = suffixArray[i + 1];
			else if (i == n - 1)
				cuurGcd = prefixArray[i - 1];
			else
				cuurGcd = gcd(suffixArray[i + 1], prefixArray[i - 1]);
			maxGcd = Math.max(cuurGcd, maxGcd);
		}

		return maxGcd != Integer.MIN_VALUE ? maxGcd : 1;
	}

	public static int gcd(int A, int B) {
		if (B == 0)
			return A;
		return gcd(B, A % B);
	}

}
