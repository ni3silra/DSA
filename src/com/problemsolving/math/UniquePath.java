package com.problemsolving.math;

public class UniquePath {

	public static void main(String[] args) {
		System.out.println(new UniquePath().uniquePaths(200, 1));
	}

	public int uniquePaths(int A, int B) {
		long ans = 1;
		for (int i = Math.max(B, A); i < (A + B - 1); i++) {
			ans *= i;
			ans /= (i - Math.max(B, A) + 1);
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
