package com.problemsolving.custom;

import java.util.*;

public class MinimumDifferencePuzzle {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();

		for (int i : new int[] { 759, 106, 827, 279, 722, 954, 80, 577, 273, 538, 963, 296, 693, 694, 684, 406, 603,
				192, 166, 233, 310, 969, 980, 36, 322, 409, 392, 824, 422, 729, 76, 532, 186, 902, 811, 907, 855 })
			A.add(i);

		System.out.println(new MinimumDifferencePuzzle().solve(A, 16));

	}

	public int solve(ArrayList<Integer> A, int B) {

		Collections.sort(A);

		System.out.println(A.toString());
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < A.size() - B; i++) {

			int newDiff = A.get(i + B - 1) - A.get(i);
			System.out.println(newDiff);
			if (min > newDiff)
				min = newDiff;
		}

		if (A.size() == 1 && B == 1)
			return 0;
		return min;
	}

}
