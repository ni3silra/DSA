package com.problemsolving.bitmanipulation;

import java.util.*;

public class SubArrayOR {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<>();

		for (int i : new int[] { 1, 2, 3, 4, 5 })
			A.add(i);

		System.out.println(new SubArrayOR().solve(A));

	}

	public int solve(ArrayList<Integer> A) {
		int mod = (int) Math.pow(10, 9) + 7;
		int sum = 0;
		int n = A.size();
		int max = Integer.MIN_VALUE;

		for (int i : A)
			if (max < i)
				max = i;

		StringBuffer buffer = new StringBuffer();

		while (max > 0) {
			int digit = max % 2;
			buffer.append(digit);
			max /= 2;
		}

		String maxStr = buffer.reverse().toString();

		for (int i = 0; i < maxStr.length(); i++) {
			int countOfZero = 0;
			for (int j = 0; j < n; j++) {
				if ((((int) A.get(j)) & 1) == 0) {
					countOfZero = 0;
				} else {
					sum -= Math.pow(2, i) * (countOfZero * (countOfZero + 1) / 2);
					countOfZero = 0;
				}
				A.set(j, A.get(j) >> 1);
			}
			sum -= Math.pow(2, i) * (countOfZero * (countOfZero + 1) / 2);
		}

		return sum % mod;
	}

	public int solve(int[] A) {

		if (A.length == 0)
			return 0;
		else if (A.length == 1)
			return A[0];

		long sum = 0, mod = 1000000007, coff = 1;

		for (int i = 0; i < 32; i++) {
			boolean loopbreak = true;
			long countZero = 0;
			long currSum = ((A.length) % mod * (A.length + 1) % mod) / 2;
			for (int j = 0; j < A.length; j++) {
				if ((A[j] & (1 << i)) == 0)
					countZero++;
				else {
					currSum -= ((countZero) * (countZero + 1)) / 2;
					countZero = 0;
				}
				if ((A[j] & ~(2 * coff - 1)) > 0)
					loopbreak = false;
			}
			currSum -= ((countZero) % mod * (countZero + 1) % mod) / 2;
			sum = (sum + (coff % mod * currSum % mod) % mod) % mod;
			coff *= 2;
			if (loopbreak)
				break;
		}
		return (int) sum;
	}
}
