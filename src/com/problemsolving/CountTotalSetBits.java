package com.problemsolving;

public class CountTotalSetBits {

	public static void main(String[] args) {
		System.out.println(new CountTotalSetBits().solve(4));
	}

	public int solve(int A) {

		A++;

		int powerOf2 = 2;

		int cnt = A / 2;

		while (powerOf2 <= A) {

			int totalPairs = A / powerOf2;

			cnt += (totalPairs / 2) * powerOf2;

			cnt += (totalPairs % 2 == 1) ? (A % powerOf2) : 0;

			powerOf2 <<= 1;
		}

		return cnt % 1000000007;
	}

}
