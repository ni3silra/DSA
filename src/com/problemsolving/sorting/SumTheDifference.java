package com.problemsolving.sorting;

import java.util.*;

public class SumTheDifference {

	public static void main(String[] args) {
		System.out.println(new SumTheDifference().solve(new ArrayList<>(List.of(1))));
		System.out.println(new SumTheDifference().solve(new ArrayList<>(List.of(1, 2))));
		System.out.println(new SumTheDifference().solve(new ArrayList<>(List.of(7, 8, 6, 4, 6))));
	} // 1 + 2 + 3

	int MOD = (int) (Math.pow(10, 9) + 7);

	public int solve(ArrayList<Integer> A) {

		Collections.sort(A);
		int n = A.size();

		long min_sum = 0, max_sum = 0;

		for (int i = 0; i < n; i++) {
			max_sum = 2 * max_sum + A.get(n - 1 - i);
			max_sum %= MOD;
			min_sum = 2 * min_sum + A.get(i);
			min_sum %= MOD;
		}

		return (int) ((max_sum - min_sum + MOD) % MOD);
	}

}
