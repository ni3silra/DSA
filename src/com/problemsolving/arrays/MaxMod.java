package com.problemsolving.arrays;

import java.util.*;

public class MaxMod {

	public static void main(String[] args) {
		int[] array = {2, 6, 4};

		ArrayList<Integer> list = new ArrayList<>();

		for (int i : array)
			list.add(i);
		
		System.out.println(new MaxMod().solve(list));
	}

	public int solve(ArrayList<Integer> A) {
		int max = Integer.MIN_VALUE;

		for (int i : A)
			for (int j : A)
				if (i % j > max)
					max = i % j;

		return max;
	}

}
