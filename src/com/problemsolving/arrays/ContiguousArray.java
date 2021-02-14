package com.problemsolving.arrays;

import java.util.ArrayList;

public class ContiguousArray {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();

		for (int i : new int[] { 1, 0, 1, 0, 1 })
			A.add(i);

		//System.out.println(new ContiguousArray().solve(A));

		String s = "abc";
		System.out.println(getAllPermutation(s, "", new ArrayList<String>()).toString());
		System.out.println(new ContiguousArray().solve("abc","abcbacabc"));
	}

	public int solve(ArrayList<Integer> A) {

		for (int i = 1; i < A.size(); i++) {

		}

		return 0;
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
