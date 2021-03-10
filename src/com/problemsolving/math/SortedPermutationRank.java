package com.problemsolving.math;

import java.util.Arrays;

import com.algorithms.dp.Factorial;

public class SortedPermutationRank {

	public static void main(String[] args) {
		System.out.println(new SortedPermutationRank().findRank("iBytes"));
		System.out.println(new SortedPermutationRank().findRank2("iBytes"));

		int a = 3;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i = a; i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

	int fact(long num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i % 1000003;
		}
		return factorial;
	}

	public int findRank(String A) {
		long rank = 0;
		long n = A.length();

		for (int i = 0; i < n - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < n; j++)
				if (A.charAt(j) < A.charAt(i))
					count++;
			rank += (count * fact(n - i - 1)) % 1000003;
		}
		return (int) ((rank + 1) % 1000003);
	}

	public int findRank2(String A) {
		int rank = 0;
		int n = A.length();
		long[] fact = new long[26];

		{ // Factorial
			fact[0] = 1;
			fact[1] = 1;

			for (int i = 2; i < 26; i++) {
				fact[i] = fact[i - 1] * i % 1000003;
			}
		}

		char[] charArr = A.toCharArray();

		Arrays.sort(charArr);
		int index = 0;
		String str = new String(charArr);
		boolean[] check = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (check[i])
				continue;
			else if (str.charAt(index) != A.charAt(i)) {
				rank += fact[n - index - 1];
			} else {
				index++;
				i--;
				check[i] = true;
			}
		}

		return rank % 1000003;
	}
}
