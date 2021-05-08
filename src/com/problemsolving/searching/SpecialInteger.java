
package com.problemsolving.searching;

import java.util.Arrays;

public class SpecialInteger {

	public static void main(String[] args) {
		System.out.println(new SpecialInteger().solve(new int[] { 5, 10, 20, 100, 105 }, 130));
		System.out.println(new SpecialInteger().solve(new int[] { 1, 2, 3, 4, 5 }, 10));
		System.out.println(
				new SpecialInteger().solve(new int[] { 2, 24, 38, 25, 35, 33, 43, 12, 49, 35, 45, 47, 5, 33 }, 249));
	}

	public int solve(int[] A, int B) {
		int N = A.length;
		long prefix[] = new long[N + 1];
		prefix[0] = 0;
		// prefix sum
		for (int i = 0; i < N; i++) {
			prefix[i + 1] = prefix[i] + A[i];
		}

		int start = 0, end = N;
		int res = 0;
		while (start <= end) {
			int mid = (start + end) / 2;

			// check for subarray sub
			boolean possible = true;
			for (int i = 0; i <= N - mid; i++) {
				// sliding window
				long sum = prefix[i + mid] - prefix[i];
				if (sum > B) {
					// not possible
					possible = false;
					break;
				}
			}
			if (possible) {
				// maximized size
				res = mid; // save current widow size
				start = mid + 1;
			} else {
				// move to left side
				end = mid - 1;
			}
		}

		return res;
	}

}
