package com.problemsolving.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solve(new int[] { 4, 7, 9 }, new int[] { 2, 11, 19 })));
	}

	public static int[] solve(final int[] A, final int[] B) {
		int n = A.length, m = B.length, ptr1 = 0, ptr2 = 0, index = 0;
		int[] ans = new int[n + m];

		while (ptr1 <= n - 1 && ptr2 <= m - 1)
			if (A[ptr1] <= B[ptr2])
				ans[index++] = A[ptr1++];
			else
				ans[index++] = B[ptr2++];

		if (ptr1 < n)
			for (int i = ptr1; i < n; i++)
				ans[index++] = A[i];
		else if (ptr2 < m)
			for (int i = ptr2; i < m; i++)
				ans[index++] = B[i];

		return ans;
	}
}
