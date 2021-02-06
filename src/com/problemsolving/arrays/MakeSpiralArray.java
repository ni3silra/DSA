package com.problemsolving.arrays;

public class MakeSpiralArray {

	public static void main(String[] args) {

		int A = 4;

		for (int[] array : new MakeSpiralArray().printSpiral(A)) {
			for (int i : array) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	int[][] printSpiral(int A) {
		int[][] matrix = new int[A][A];
		int T = 0;
		int R = A - 1;
		int L = 0;
		int B = A - 1;

		int i = 0;
		int value = 1;
		while (L <= R && T <= B) {

			for (i = L; i <= R; i++)
				matrix[T][i] = value++;
			T++;

			for (i = T; i <= B; i++)
				matrix[i][R] = value++;
			R--;

			for (i = R; i >= L; i--)
				matrix[B][i] = value++;
			B--;

			for (i = B; i >= T; i--)
				matrix[i][L] = value++;
			L++;

		}
		return matrix;
	}
}
