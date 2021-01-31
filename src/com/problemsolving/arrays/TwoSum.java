package com.problemsolving.arrays;

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

}
