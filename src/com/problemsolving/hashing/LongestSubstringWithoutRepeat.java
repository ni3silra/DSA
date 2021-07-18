package com.problemsolving.hashing;

import java.util.*;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		System.out.println(new LongestSubstringWithoutRepeat().lengthOfLongestSubstring("dadbc"));
	}

	public int lengthOfLongestSubstring(String A) {
		HashSet<Character> seen = new HashSet<>();

		int max = 0, i = 0;

		for (int j = 0; j < A.length(); j++) {
			char c = A.charAt(j);

			while (seen.contains(c)) {
				seen.remove(A.charAt(i++));
			}

			seen.add(c);
			max = Math.max(j - i + 1, max);

		}
		return max;
	}
}
