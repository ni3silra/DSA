package com.problemsolving.arrays;

import java.util.*;

public class MaxMod {

	public static void main(String[] args) {
		int[] array = { 2, 6, 4 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i : array)
			list.add(i);

		System.out.println(new MaxMod().solve(list));
	}

	public int solve(ArrayList<Integer> A) {
		int max = Integer.MIN_VALUE;

		for (int i : A)
			for (int j : A)
				if (j != 0 && i % j > max)
					max = i % j;

		return max;
	}

	public int solve2(int[] A) {
		int n = A.length;
		int flag = 0;

		// sort the array
		Arrays.sort(A);

		// keep the pointer at the end of the array
		int i = n - 1;

		// keep going backwards until we don't find a different element
		while (flag == 0 && i != 0) {
			if (A[i] == A[i - 1])
				i--;
			else
				flag = 1;
		}

		// if we find a different element before reaching the end of the array, print
		// the element
		// at the index before that
		// else return 0 because in that case all the elements are same and no
		// matter which indices we choose, the answer will always be 0
		if (i != 0)
			return A[i - 1];
		else
			return 0;
	}

}
