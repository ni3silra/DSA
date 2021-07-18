package com.problemsolving.backtracking;

import java.util.*;

public class NumberOfSquarefulArrays {

	public static void main(String[] args) {
//		System.out.println(new NumberOfSquarefulArrays().sqrtUtil(16));
//		new NumberOfSquarefulArrays().permute(new ArrayList<>(List.of(2, 2, 2)), 0, 2);
		new NumberOfSquarefulArrays().solve(new ArrayList<>(List.of(41)));
	}

	HashSet<ArrayList<Integer>> helperSet;
	int output;

	void init() {
		helperSet = new HashSet<>();
		output = 0;
	}

	public void swap(ArrayList<Integer> A, int i, int j) {
		int temp;
		temp = A.get(i);
		A.set(i, A.get(j));
		A.set(j, temp);
	}

	private void permute(ArrayList<Integer> A, int l, int r) {
		if (l == r) {
			if (helperSet.add(A) && checkSquareFulArray(A))
				output++;
		} else {
			for (int i = l; i <= r; i++) {
				swap(A, l, i);
				permute(A, l + 1, r);
				swap(A, l, i);
			}
		}
	}

	public int solve(ArrayList<Integer> A) {
		init();
		int[] nums;

		if (A.size() == 1) {
			if (isSquare(A.get(0)))
				output++;
		} else {
			permute(A, 0, A.size() - 1);
		}
		System.out.println(output);
		return output;

	}

	public boolean checkSquareFulArray(ArrayList<Integer> list) {
		for (int i = 1; i < list.size(); i++) {
			int sum = list.get(i - 1) + list.get(i);
			if (!isSquare(sum))
				return false;
		}
		return true;
	}

	public boolean isSquare(int num) {
		int n = sqrtUtil(num);
		return n * n == num;
	}

	public int sqrtUtil(int A) {
		int start = 1, end = A, ans = 0;

		if (A != 0) {
			while (start <= end) {
				int mid = start + ((end - start) / 2);
				if (mid <= A / mid) {
					ans = mid;
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}

		return ans;
	}

	////////////////////////////////////////////////////////////////

	private int backtracking(int[] nums, boolean[] used, int index, int[] perm) {
		if (index == perm.length)
			return 1;
		Set<Integer> uniqueNum = new HashSet<>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (used[i])
				continue;
			if (uniqueNum.contains(nums[i]))
				continue; // prune + remove duplicates: only consider unique numbers for each index of
							// permutation
			if (index > 0 && isPerfect(nums[i], perm[index - 1]))
				continue;
			used[i] = true;
			uniqueNum.add(nums[i]);
			perm[index] = nums[i];
			count += backtracking(nums, used, index + 1, perm);
			perm[index] = 0;
			used[i] = false;
		}
		return count;
	}

	private boolean isPerfect(int curr, int prev) {
		int sum = curr + prev;
		return Math.pow((int) Math.sqrt(sum), 2) != sum;
	}
}
