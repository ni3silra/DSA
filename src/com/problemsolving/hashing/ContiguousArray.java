package com.problemsolving.hashing;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		System.out.println(new ContiguousArray().solve(new int[] { 1, 0, 1, 0 }));
	}

	public int solve(int[] A) {
		int ans = Integer.MIN_VALUE;

		HashMap<Integer, Integer> map = new HashMap<>();

		int countZero = 0;
		int countOne = 0;
		map.put(0, -1);
		for (int i = 0; i < A.length; i++) {

			if (A[i] == 0)
				countZero++;
			else
				countOne++;

			int diff = countOne - countZero;

			if (map.get(diff) != null) {
				int newDiff = i - map.get(diff);
				if (newDiff > ans)
					ans = newDiff;
			} else {
				map.put(diff, i);
			}

		}

		return ans;
	}

}

class Pair2 {

	public int diff;
	public int first;
	public int second;

	public Pair2(int diff, int first, int second) {
		this.first = first;
		this.second = second;
		this.diff = diff;
	}

	@Override
	public String toString() {
		return "F:" + first + " S:" + second + " D:" + diff;
	}
}
