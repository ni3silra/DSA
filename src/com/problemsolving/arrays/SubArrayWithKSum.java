package com.problemsolving.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithKSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new SubArrayWithKSum().solve(new int[] { 1, 2, 3 }, 6)));
	}

	public int[] solve(int[] A, int B) {

		HashMap<Long, Long> map = new HashMap<>();
		int startIndex = -1;
		int endIndex = -1;
		long current_sum = 0;
		for (int i = 0; i < A.length; i++) {
			current_sum += A[i];
			map.put(current_sum, (long) i);
			if (map.get(current_sum - B) != null) {
				startIndex = (int) (map.get(current_sum - B) + 1);
				endIndex = i;
				break;
			} else if (map.get((long) B) != null) {
				startIndex = 0;
				endIndex = i;
				break;
			}
		}

		if (startIndex != -1) {
			int[] array = null;
			int j = 0;

			if (endIndex - startIndex == 0)
				array = new int[1];
			else
				array = new int[endIndex - startIndex + 1];
//			System.out.println(endIndex + " " + startIndex + " " + array.length);
			for (int i = startIndex; i <= endIndex; i++) {
				array[j++] = A[i];
			}
			return array;
		}

		return new int[] { -1 };
	}

	public int solve1(int[] A, int B) {
		HashSet<Long> set = new HashSet<>();
		Long current_sum = 0L;
		for (int i : A) {
			current_sum += i;
			if (set.contains(current_sum - B))
				return 1;
			set.add(current_sum);
		}
		return 0;
	}

}
