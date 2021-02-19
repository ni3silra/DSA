package com.problemsolving.hashing;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		System.out.println(new ContiguousArray().solve(new int[] { 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1 }));
	}

	public int solve(int[] A) {
		int largestSubArrayLength = Integer.MIN_VALUE;
		HashMap<Integer, Pair> map = new HashMap<>();
		int countZero = 0;
		int countOne = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				countZero++;
			else
				countOne++;
			map.put(i, new Pair(countZero, countOne));
		}
		System.out.println(map.toString());
		int previousCount = 0;
		for (int i : map.keySet()) {
			int count = 0;
			Pair pair = map.get(i);
			if (pair.first != 0 && pair.second != 0)
				count = 2 * (pair.first <= pair.second ? pair.first : pair.second);
			if (previousCount == count)
				count = previousCount;
			largestSubArrayLength = count < largestSubArrayLength ? largestSubArrayLength : count;
			count = previousCount;
		}
		return largestSubArrayLength;
	}

}

//class Pair {
//
//	public int first;
//	public int second;
//
//	public Pair(int first, int second) {
//		this.first = first;
//		this.second = second;
//	}
//}

class MyClass {
	public static void main(String args[]) {
		Integer x = 10;
		printA(x);
		System.out.println("X in Main after print " + x);
	}

	static void printA(Integer x) {
		x = 6;
		System.out.println("X in print " + x);
	}
}
