package com.problemsolving.recursion;

import java.util.*;

public class AllPermutations {

	public static void main(String[] args) {
		System.out.println(new AllPermutations().permute(new ArrayList<>(List.of(1, 1, 2))));
	}

	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		// Collections.sort(A);

		int[] nums = new int[A.size()];

		for (int i = 0; i < A.size(); i++) {
			nums[i] = A.get(i);
		}

		return calculatePermutations(nums, new ArrayList<>(), new ArrayList<ArrayList<Integer>>());
	}

	public  ArrayList<ArrayList<Integer>> calculatePermutations(int[] nums, ArrayList<Integer> asf,
			ArrayList<ArrayList<Integer>> finalRes) {
		// base case - add formed permutation to finalRes list
		if (nums.length == 0) {
			finalRes.add(asf);
			return finalRes;
		}

		for (int i = 0; i < nums.length; i++) {
			int fnum = nums[i];
			asf.add(fnum);

			// create new nums array with elements other than fnum
			int[] newNums = new int[nums.length - 1];
			int k = 0;

			// traverse elements to the left of fnum and add to nums
			for (int j = 0; j < i; j++, k++) {
				newNums[k] = nums[j];
			}

			// traverse elements to the right of fnum and add to nums
			if (i + 1 <= nums.length - 1) {
				for (int j = i + 1; j < nums.length; j++, k++) {
					newNums[k] = nums[j];
				}
			}

			// recusrively call calculatePermutations with new nums array
			finalRes = calculatePermutations(newNums, new ArrayList<>(asf), finalRes);
			asf.remove(asf.size() - 1);
		}

		return finalRes;
	}
}
