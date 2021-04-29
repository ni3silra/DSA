package com.problemsolving.hashing;

import java.util.*;

public class ReplicatingSubstring {

	public static void main(String[] args) {
		System.out.println(new ReplicatingSubstring().solve(2, "bbaabb"));
		System.out.println(new ReplicatingSubstring().solve(1, "bc"));
	}

	public int solve(int A, String B) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : B.toCharArray())
			map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);

		for (char c : map.keySet())
			if (map.get(c) % A != 0)
				return 0;

		return 1;
	}

}
