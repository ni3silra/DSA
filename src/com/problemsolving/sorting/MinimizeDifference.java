package com.problemsolving.sorting;

import java.util.*;

public class MinimizeDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(ArrayList<Integer> A, int B) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int totalSum = 0;

		for (int i : A) {
			if (min > i)
				min = i;
			else if (max < i)
				max = i;
			totalSum += i;
		}

		if (totalSum < B)
			return 0;

		if (max - min <= B)
			return max - min;

		int avg = (max + min) / 2;

		for (int i = 0; i < B; i++)
			if (A.get(i) > avg)
				A.set(i, A.get(i) - B);
			else
				A.set(i, A.get(i) + B);

		for (int i : A)
			if (min > i)
				min = i;
			else if (max < i)
				max = i;

		return max - min;
	}

}
