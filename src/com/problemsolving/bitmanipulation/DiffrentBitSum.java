package com.problemsolving.bitmanipulation;

public class DiffrentBitSum {

	public static void main(String[] args) {
		System.out.println(new DiffrentBitSum().cntBits(new int[] { 1, 3, 5 }));

	}

	public int cntBits(int[] A) {
		int mod = 1000000007;
		long ans = 0;

		for (int i = 0; i < 32; i++) {
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if ((A[j] & (1 << i)) == 0) {
					count++;
				}
			}
			ans += 2l * count * 1l * (A.length - count);
			ans %= mod;
		}

		return (int) ans;
	}

}
