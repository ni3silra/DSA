package com.problemsolving.arrays;

public class SearchANumIn2D {

	public static void main(String[] args) {

	}

	public int solve(int[][] A, int B) {
		int output = -1;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] == B)
					return i * 1009 + j;
			}
		}

		return output;
	}

}
