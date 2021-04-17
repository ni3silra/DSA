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
		for (int i = 0; i < B; i++) {
			int minn = Integer.MAX_VALUE, idx = 0;
			for (int j = i; j < A.length; j++) {
				if (A[j] < minn) {
					minn = A[j];
					idx = j;
				}
			}

			int tmp = A[i];
			A[i] = A[idx];
			A[idx] = tmp;
		}

		return A[B - 1];
	}

	public static int kthsmallest1(int[] A, int B) {

		Arrays.sort(A);

		return A[B - 1];
	}

}
