package com.problemsolving.math;

public class UniquePath {

	public static void main(String[] args) {
		System.out.println(new UniquePath().uniquePaths(200, 1));
	}

	public int uniquePaths(int A, int B) {
		long ans = 1;
		int num = Math.max(B, A);
		for (int i = num; i < (A + B - 1); i++) {
			ans *= i;
			ans /= (i - num + 1);
		}
		return (int) ans;
	}

	double getFactorial(int number) {
		double factorial = 1;
		if (number < 0)
			return 0;
		for (int i = 1; i <= number; i++)
			factorial *= (double) i;
		return factorial;
	}

}
