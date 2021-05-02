package com.problemsolving.searching;

public class AthMagicalNumber {

	public static void main(String[] args) {
		System.out.println(new AthMagicalNumber().solve2(807414236, 3788, 38141));
	}

	public int solve(int A, int B, int C) {
		int counter = 0;
		for (int i = 2; i <= A * Math.max(B, C); i++) {
			if (i % B == 0 || i % C == 0) {
				counter++;
			}
			if (counter == A) {
				return i;
			}
		}
		return 0;
	}// bruteForce

	public int solve2(int A, int B, int C) {
		int mod = (int) Math.pow(10, 9) + 7;
		long low = 1;
		long high = A * 1l * Math.max(B, C);
		long ans = 0;

		long gcd = getGcd(B, C);
		long lcm = getLcm(B, C, gcd);

		while (low <= high) {
			long mid = (low + high) / 2;
			long count = getFx(mid, B, C, lcm);
			if (count >= A) {
				ans = mid;
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return (int) ans % mod;
	}

	public long getFx(long x, long b, int c, long l) {
		return (x / b) + (x / c) - (x / l);
	}

	public long getLcm(long b, long c, long gcd) {
		return (b * c) / gcd;
	}

	public long getGcd(long A, long B) {
		if (B == 0)
			return A;
		return getGcd(B, A % B);
	}

}
