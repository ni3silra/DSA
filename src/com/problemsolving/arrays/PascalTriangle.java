package com.problemsolving.arrays;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println(new PascalTriangle().solve(5));
	}

	public ArrayList<ArrayList<Integer>> solve(int A) {
		ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();

		if (A == 0) {
			return null;
		}

		while (table.size() <= A - 1)
			table.add(new ArrayList<>());
		int start = 0;
		for (int line = 0; line < A; line++) {
			for (int i = 0; i <= line; i++) 
				table.get(start).add(binomialCoeff(line, i));
			start++;
		}

		return table;
	}

	static int binomialCoeff(int n, int k) {
		int res = 1;

		if (k > n - k)
			k = n - k;

		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

}
