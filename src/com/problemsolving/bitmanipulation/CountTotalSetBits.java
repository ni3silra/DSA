package com.problemsolving.bitmanipulation;

public class CountTotalSetBits {

	public static void main(String[] args) {
		System.out.println(new CountTotalSetBits().solve(4));
		System.out.println(new CountTotalSetBits().solve2(7));
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

	public int solve2(int A) {
		int cnt = 0;
//		while (A != 0) {
//			cnt++;
//			A = A & (A - 1);
//		}

//		cnt = 0;

//		for (int i = 0; i < 32; i++) {
//			if (((A >> i) & 1) == 1)
//				cnt++;
//		}

		// cnt = 0;

		for (int i = 0; i < 32; i++) {
			if ((A & (1 << i)) == 1)
				cnt++;
		}

		return cnt;
	}

}
