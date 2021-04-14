package com.problemsolving.sorting;

import java.util.Arrays;

public class MaximumUnsortedSubarray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(subUnsort(new int[] { 1, 3, 2, 4, 5 })));
	}

	public static int[] subUnsort(final int[] A) {
		int n = A.length;
		int[] sortedArray = new int[n];

		for (int i = 0; i < n; i++)
			sortedArray[i] = A[i];

		int startIndex = -1;
		int endIndex = -1;

		Arrays.sort(sortedArray);

		for (int i = 0; i < n; i++) {
			if (A[i] != sortedArray[i]) {
				startIndex = i;
				break;
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			if (A[i] != sortedArray[i]) {
				endIndex = i;
				break;
			}
		}
		if (startIndex != -1 && endIndex != -1)
			return new int[] { startIndex, endIndex };
		return new int[] { -1 };
	}

}
