package com.problemsolving.arrays;

import java.util.ArrayList;

public class MultiplicationOfPreviousAndNext {

	public static void main(String[] args) {
		int[] a = { 0 };
		ArrayList<Integer> A = new ArrayList<>();
		for (int i : a)
			A.add(i);

		System.out.println(new MultiplicationOfPreviousAndNext().solve(A));

	}

	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> list = new ArrayList<>();
		if (A.size() < 2)
			list = A;
		else
			for (int i = 0; i < A.size(); i++) {
				if (i == 0) {
					list.add(i, A.get(i) * A.get(i + 1));
				} else if (i == A.size() - 1) {
					list.add(i, A.get(i) * A.get(i - 1));
				} else {
					list.add(i, A.get(i - 1) * A.get(i + 1));
				}
			}

		return list;
	}

}
