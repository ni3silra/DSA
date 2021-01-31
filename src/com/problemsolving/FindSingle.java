package com.problemsolving;

public class FindSingle {

	public static void main(String[] args) {
		// System.out.println(new FindSingle().singleNumber(new int[] { 1, 2, 2, 3, 1
		// }));
		System.out.println(new FindSingle().singleNumber2(new int[] { 1, 2, 1, 1 }));

	}

	public int singleNumber(int[] A) {
		int temp = 0;
		for (int num : A)
			temp = temp ^ num;
		return temp;
	}

	public int singleNumber2(int[] A) {
		int ones = 0, twos = 0;
		int common_bit_mask;

		for (int i = 0; i < A.length; i++) {
			twos = twos | (ones & A[i]);

			ones = ones ^ A[i];

			common_bit_mask = ~(ones & twos);

			ones &= common_bit_mask;

			twos &= common_bit_mask;
		}
		return ones;
	}

}
