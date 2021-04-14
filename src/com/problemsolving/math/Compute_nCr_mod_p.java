package com.problemsolving.math;

public class Compute_nCr_mod_p {

	public static void main(String[] args) {
		System.out.println(new Compute_nCr_mod_p().pow(89138, 3275381, 113346546));
		System.out.println(new Compute_nCr_mod_p().solve(89138, 65616, 3275381));
		// System.out.println(new Compute_nCr_mod_p().solve(6, 2, 13));
	}

	public int solve(int A, int B, int C) {
		long[] fact = new long[A + 1];
		fact[0] = 1l;

		for (int i = 1; i <= A; i++)
			fact[i] = (i % C * 1l * fact[i - 1] % C) % C;

		return (int) (((fact[A] % C * pow(fact[B], C - 2, C) % C) * pow(fact[A - B], C - 2, C) % C) % C);
	}

	public long pow(long num, long pow, int C) {

		if (pow <= 1)
			return num % C;
		long ans = pow(num, pow / 2, C) % C;

		if (pow % 2 == 0)
			return (ans % C * ans % C) % C;
		else
			return (num % C * (ans % C * ans % C) % C) % C;
	}

}
