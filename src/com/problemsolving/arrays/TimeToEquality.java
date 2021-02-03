package com.problemsolving.arrays;

import java.util.ArrayList;

public class TimeToEquality {

	public static void main(String[] args) {

	}

	public int solve(ArrayList<Integer> A) {
		int equality = 0;

		int max = Integer.MIN_VALUE;

		for (int i : A)
			if (i > max)
				max = i;

		for (int i : A)
			equality += max - i;

		return equality;
	}

}
