
package com.problemsolving.searching;

public class SpecialInteger {

	public static void main(String[] args) {
		System.out.println(new SpecialInteger().solve(new int[] { 1, 2, 3, 4, 5 }, 10));
	}

	public int solve(int[] A, int B) {
		int n = A.length;
		int[] prefixSum = new int[n];

		prefixSum[0] = A[0];

		for (int i = 1; i < n; i++)
			prefixSum[i] = prefixSum[i - 1] + A[i];
		// System.out.println(Arrays.toString(prefixSum));

		for (int i = 0; i < n; i++) {
			
		}

		return 0;
	}

}
