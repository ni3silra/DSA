package com.problemsolving.arrays;

public class Pattern {

	public static void main(String[] args) {

		int A = 6;

		int[][] array = new int[A][A];

		for (int i = 0; i < A; i++) {
			int curr_col = A - 1;
			for (int j = 1; j <= i + 1; j++) {
				array[i][curr_col--] = j;
			}
		}

		for (int[] a : array) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
