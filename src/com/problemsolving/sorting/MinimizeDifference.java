package com.problemsolving.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class MinimizeDifference {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i : new int[] { 4, 6, 3, 1, 4 })
			list.add(i);

		System.out.println(new MinimizeDifference().solve(list, 5));
	}

	public int solve(ArrayList<Integer> A, int B) {

		int num = -1;
		int j = A.size() - 1;

		while (B / 2 > 0) {
			Collections.sort(A);

			num = A.get(0);
			A.remove(0);
			A.add(++num);

			num = A.get(j);
			A.remove(j);
			A.add(--num);

			B--;
		}
		Collections.sort(A);
		return A.get(j) - A.get(0);
	}

}
