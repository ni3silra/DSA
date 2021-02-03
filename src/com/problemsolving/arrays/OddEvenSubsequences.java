package com.problemsolving.arrays;

public class OddEvenSubsequences {

	public static void main(String[] args) {
		System.out.println(new OddEvenSubsequences().solve(new int[] { 16, 19, 13, 43, 21, 47, 20 }));
	}

	public int solve(int[] A) {
		int maxNum = 0;
		int countEven = 0;
		int countOdd = 0;

		for (int i : A)
			if (i % 2 == 0)
				countEven++;
			else
				countOdd++;

		maxNum = countEven < countOdd ? countEven : countOdd;

		if (countEven == 0 || countOdd == 0)
			return 1;
		else if (A[0] % 2 == 0 && countEven < countOdd)
			return maxNum * 2;
		else if (A[0] % 2 != 0 && countOdd < countEven)
			return maxNum * 2;
		else
			return maxNum * 2 - 1;
	}

}
