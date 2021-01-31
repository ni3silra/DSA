package com.problemsolving.bitmanipulation;

public class ReverseBits {

	public static void main(String[] args) {
		System.out.println(new ReverseBits().reverseBits(2));
	}

	public long reverseBits(long n) {
		long rev = 0;

		for (int i = 0; i < 32; i++) {
			rev <<= 1;
			if ((n & (1 << i)) != 0)
				rev |= 1;
		}

		return rev;
	}

	public int numSetBits(long A) {
		int count = 0;
		while (A > 0) {
			if ((A & 1) == 1)
				count++;
			A >>= 1;
		}
		return count;
	}

}
