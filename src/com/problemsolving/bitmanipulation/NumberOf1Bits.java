package com.problemsolving.bitmanipulation;

public class NumberOf1Bits {

	public static void main(String[] args) {
		System.out.println(new NumberOf1Bits().numSetBits(11));

	}

	public int numSetBits(long A) {
		int count = 0;
		while (A > 0) {
			if (((A & 1) == 1)) {
				count++;
			}
			A >>= 1;
		}
		return count;
	}

	public int numSetBits1(long a) {
		int noOf1Bit = 0;

		for (int i : toBinary(a)) {
			System.out.print(i);
			if (i == 1)
				noOf1Bit++;
		}
		System.out.println();
		return noOf1Bit;
	}

	public int[] toBinary(long decimal) {
		int binary[] = new int[32];
		int index = 0;

		while (decimal > 0) {
			binary[index++] = (int) (decimal % 2);
			decimal = decimal / 2;
		}

		return binary;
	}

}
