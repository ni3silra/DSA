package com.problemsolving.math;

import java.util.*;

public class PairSumdivisiblebyM {

	public static void main(String[] args) {
		System.out.println(new PairSumdivisiblebyM().solve(new int[] { 5, 17, 100, 11 }, 28));
		System.out.println(new PairSumdivisiblebyM().solve(new int[] { 1, 2, 3, 4, 5 }, 2));
	}

	public int solve(int[] A, int B) {
		long ans = 0;
		long mod = 1000000007;
		long[] countArray = new long[B];

		for (int num : A)
			countArray[num % B]++;

		int i = 1, j = B - 1;
		ans = ((countArray[0] * (countArray[0] - 1))) / 2;
		ans %= mod;
		while (i <= j) {
			if (i == j) {
				ans += ((countArray[i] * (countArray[j] - 1))) / 2;
				ans %= mod;
			} else {
				ans += countArray[i] * countArray[j];
				ans %= mod;
			}
			i++;
			j--;
		}
		return (int) ans;
	}

}
