package com.problemsolving.sorting;

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length = nums1.length + nums2.length;
		int midIndex = (length - 1) / 2;
		double[] ans = merge(nums1, nums2);
		return length % 2 == 0 ? (ans[midIndex] + ans[midIndex + 1]) / 2 : ans[midIndex];
	}

	public double[] merge(int[] arr1, int[] arr2) {
		int n = arr1.length, m = arr2.length, ptr1 = 0, ptr2 = 0, index = 0;
		double[] ans = new double[n + m];

		while (ptr1 <= n - 1 && ptr2 <= m - 1)
			if (arr1[ptr1] <= arr2[ptr2])
				ans[index++] = arr1[ptr1++];
			else
				ans[index++] = arr2[ptr2++];

		if (ptr1 < n)
			for (int i = ptr1; i < n; i++)
				ans[index++] = arr1[i];
		else if (ptr2 < m)
			for (int i = ptr2; i < m; i++)
				ans[index++] = arr2[i];

		return ans;
	}

}
