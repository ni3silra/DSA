package com.problemsolving.arrays;

import java.util.ArrayList;

public class PrimalPower {

	public static void main(String[] args) {

		int[] a = { -11, 7, 8, 9, 10, 11 };
		ArrayList<Integer> A = new ArrayList<>();
		for (int i : a)
			A.add(i);

		System.out.println(new PrimalPower().solve(A));

	}

	public int solve(ArrayList<Integer> A) {
		int primalPower = 0;

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > 0 && checkPrime(A.get(i)))
				primalPower++;
		}
		return primalPower;
	}

	static boolean checkPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			if (flag == 0) {
				return true;
			}
		} // end of else
		return false;
	}

}
