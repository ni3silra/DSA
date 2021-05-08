package com.problemsolving.searching;

public class PainterPartitionProblem {

	public static void main(String[] args) {

	}

	public int paint(int A, int B, int[] C) {
		int minValue = 0, maxValue = 0;

		for (int i = 0; i < C.length; i++) {
			maxValue = +(C[i] * B);
			minValue = Math.max(C[i] * B, minValue);
		}

		while (minValue <= maxValue) {
			int midValue = (minValue + maxValue) / 2;

			for (int i = 0; i < C.length; i++) {
				if (midValue - C[i] * B <= 0) {
					
				}else {
					
				}
			}

		}

		return minValue;
	}

}
