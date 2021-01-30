package com.problemsolving;

public class MinimumPicks {

	public static void main(String[] args) {
		System.out.println(new MinimumPicks().solve(new int[] { 0, 2, 9 }));
		System.out.println(new MinimumPicks().solve(new int[] { 5, 17, 100, 1 }));

	}

	public int solve(int[] A) {
		int maxEven = Integer.MIN_VALUE;
		int minOdd = Integer.MAX_VALUE;

		for (int num : A)
			if (num % 2 == 0) {
				if (maxEven < num)
					maxEven = num;
			} else {
				if (minOdd > num)
					minOdd = num;
			}

		return maxEven - minOdd;
	}

}
