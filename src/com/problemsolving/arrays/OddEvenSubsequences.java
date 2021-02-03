package com.problemsolving.arrays;

import java.util.ArrayList;

public class OddEvenSubsequences {

	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 2, 2, 2 }; // 3
		int[] b = { 10, 9, 34, 14, 28, 25, 1, 18, 35, 7, 40 }; // 7
		ArrayList<Integer> A = new ArrayList<>();
		for (int i : a)
			A.add(i);

		System.out.println(new OddEvenSubsequences().solve(A));

	}

	public int solve(ArrayList<Integer> A) {
		int maxNum = 0;

		for (int i = 1; i < A.size(); i++) {

			if (A.get(i) % 2 == 0 && A.get(i - 1) % 2 != 0) {
				maxNum++;
			} else if (A.get(i) % 2 != 0 && A.get(i - 1) % 2 == 0) {
				maxNum++;
			}

		}

		return maxNum + 1;

	}

}
