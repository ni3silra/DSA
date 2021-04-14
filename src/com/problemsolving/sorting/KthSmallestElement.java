package com.problemsolving.sorting;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		System.out.println(kthsmallest(
				new int[] { 8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66,
						35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92 },
				9));
		System.out.println(kthsmallest1(
				new int[] { 8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66,
						35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92 },
				9));
	}

	public static int kthsmallest(final int[] A, int B) {

		for (int i = A.length - 1; i >= 0; i--)
			for (int j = i; j >= B; j--)
				if (A[i] > A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}

		System.out.println(Arrays.toString(A));

		return A[A.length - B - 1];
	}

	public static int kthsmallest1(int[] A, int B) {

		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		return A[B - 1];
	}

}
