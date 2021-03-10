package com.problemsolving.custom;

import java.util.*;

public class MaximumDifference {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
//
//		for (int i : )
//			A.add(i);

		System.out.println(new MaximumDifference()
				.solve(new int[] { 70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87 }, 16));
	}

	public int solve(int[] A, int B) {

		// |s1-s2| = Math.max(|sum_array - (smallest_B_elements)*2|, |sum_array -
		// (largest_B_elements)*2|)
		long s1 = 0, s = 0;
		int n = A.length;
		int ans = 0;
		Arrays.sort(A);

		for (int i : A)
			s += i;

		if (B <= n / 2)
			for (int j = 0; j < B; j++)
				s1 += A[j];
		else
			for (int j = n - 1; j > n - 1 - B; j--)
				s1 += A[j];

		ans = (int) (s > 2 * s1 ? s - (2 * s1) : 2 * s1 - s);

		return ans;
	}

}
