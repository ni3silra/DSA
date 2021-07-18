package com.problemsolving.math;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(findSquareRoot(370000000000000.0));
	}

	static int findSquareRoot(double number) {

		for (int i = 0; i <= number; i++) {

			if (i * i > number)
				break;

			if (i * i == number)
				return i;
		}
		return -1;
	}

	public int sqrt(int A) {
		int start = 1, end = A, ans = 0;

		if (A == 0)
			return 0;

		while (start <= end) {
			int mid = start + ((end - start) / 2);
			if (mid <= A / mid) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return ans;
	}

}
