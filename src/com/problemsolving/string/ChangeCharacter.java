package com.problemsolving.string;

import java.util.Collections;
import java.util.HashMap;

/*Given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.*/

public class ChangeCharacter {

	public static void main(String[] args) {
		System.out.println(new ChangeCharacter().solve("abcabbccd", 3));
	}

	public int solve(String A, int B) {

		char[] arr = A.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : arr)
			if (map.get(c) == null)
				map.put(c, 1);
			else
				map.put(c, map.get(c) + 1);

		while (B > 0) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			char deciderMin = ' ';
			char deciderMax = ' ';
			for (char c : map.keySet()) {
				if (min > map.get(c)) {
					min = map.get(c);
					deciderMin = c;
				}
				if (max < map.get(c)) {
					max = map.get(c);
					deciderMax = c;
				}
			}
			map.put(deciderMax, map.get(deciderMax) + 1);
			if (map.get(deciderMin) == 1) {
				map.remove(deciderMin);
			} else {
				map.put(deciderMin, map.get(deciderMin) - 1);
			}
			B--;
		}

		return map.keySet().size();
	}

}
