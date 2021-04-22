package com.problemsolving.hashing;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		System.out.println(new LongestSubstringWithoutRepeat().lengthOfLongestSubstring("dadbc"));
	}

	public int lengthOfLongestSubstring(String A) {

		HashSet<Character> set = new HashSet<>();
		int max = 1;

		for (char c : A.toCharArray()) {
			if (!set.add(c)) {
				max = Math.max(max, set.size());
				set = new HashSet<>();
				set.add(c);
			}
		
		}

		return Math.max(max, set.size());

	}
}
