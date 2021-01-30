package com.problemsolving;

public class ReserveBits {

	public static void main(String[] args) {
		System.out.println(new ReserveBits().reverseBits(3));

	}

	public long reverseBits(long n) {
		for (long i = 0; i < 16; i++) {
			n = swapBits(n, i, 32 - i - 1);
		}
		return n;
	}

	public long swapBits(long n, long i, long j) {
		long a = (n >> i) & 1;
		long b = (n >> j) & 1;

		if ((a ^ b) != 0) {
			return n ^= (1 << i) | (1 << j);
		}

		return n;
	}

}
