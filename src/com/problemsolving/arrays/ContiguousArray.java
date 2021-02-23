package com.problemsolving.arrays;

import java.util.*;

public class ContiguousArray {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();

		for (int i : new int[] { 1, 0, 1, 0, 1 })
			A.add(i);

		// System.out.println(new ContiguousArray().solve(A));

		String s = "abc";
//		System.out.println(getAllPermutation(s, "", new ArrayList<String>()).toString());
//		System.out.println(new ContiguousArray().solve("abc", "abcbacabc"));
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

		for (int i : map.keySet()) {
			int count = 0;
			Pair pair = map.get(i);
			if (pair.first != 0 && pair.second != 0)
				count = (pair.first < pair.second ? pair.first : pair.second);

			largestSubArrayLength = count < largestSubArrayLength ? largestSubArrayLength : count;
			System.out.println(i + " " + pair + " " + largestSubArrayLength);
		}

		return 2 * largestSubArrayLength;
	}

	public int solve(String A, String B) {
		ArrayList<String> list = getAllPermutation(A, "", new ArrayList<String>());
		int count = 0;

		if (list.size() == 1) {
			for (char c : B.toCharArray()) {
				if (c == list.get(0).charAt(0))
					count++;
			}
		} else {

			for (String str : list)
				if (B.contains(str))
					count++;
		}
		return count;
	}

	static ArrayList<String> getAllPermutation(String str, String ans, ArrayList<String> list) {

		if (str.length() == 0) {
			list.add(ans);
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			getAllPermutation(ros, ans + ch, list);

		}

		return list;
	}

}

class Pair {

	public int first;
	public int second;

	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "F" + first + "+S" + second;
	}
}