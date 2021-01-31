package com.problemsolving.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		for (int i : new TwoSum().twoSum1(new int[] { 2, 4, 11, 6 }, 8))
			System.out.println(i);

	}

	public int[] twoSum0(int[] nums, int target) {
		int reqArray[] = null;

		for (int i = 0; i < nums.length; i++)
			for (int j = 1; j < nums.length; j++)
				if (nums[i] + nums[j] == target && i != j)
					reqArray = new int[] { i + 1, j + 1 };

		return reqArray;
	} // O(n^2)

	public int[] twoSum1(int[] nums, int target) {
		int reqArray[] = null;

		HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int key = target - nums[i];
			if (values.containsKey(key))
				reqArray = new int[] { i + 1, values.get(key) + 1 };
			values.put(nums[i], i);
		}

		return reqArray;
	} // O(n)

	public boolean twoSum2(int[] arr, int k) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int siblingIndex = Arrays.binarySearch(arr, k - arr[i]);
			if (siblingIndex >= 0) {
				if (siblingIndex != i || (i > 0 && arr[i - 1] == arr[i])
						|| (i < arr.length - 1 && arr[i + 1] == arr[i])) {
					return true;
				}
			}
		}
		return false;
	} // O( nlogn )

	public boolean twoSum3(int[] arr, int k) {
		Arrays.sort(arr);
		int lhs = 0, rhs = arr.length - 1;
		while (lhs < rhs) {
			int sum = arr[lhs] + arr[rhs];
			if (sum == k)
				return true;
			else if (sum < k)
				lhs++;
			else
				rhs--;
		}
		return false;
	} // O( nlogn )

}
