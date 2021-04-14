package com.problemsolving.math;

import java.util.*;

public class SolveSubSequencesAndReturnOR {

	public static void main(String[] args) {
		System.out.println(new SolveSubSequencesAndReturnOR().solve(new ArrayList<>(List.of(2, 4, 6, 8))));

	}

	public int solve(ArrayList<Integer> A) {
		int n = A.size();
		ArrayList<Integer> gcdList = new ArrayList<>();

		gcdList.add(A.get(0));
		for (int i = 0; i < n - 1; i++) {
			gcdList.add(gcd(A.get(i + 1), gcdList.get(i)));
		}

		for (int i : gcdList)
			if (i == 1)
				return 1;

		return 0;
	}

	public static int gcd(int A, int B) {
		if (B == 0)
			return A;
		return gcd(B, A % B);
	}
}
