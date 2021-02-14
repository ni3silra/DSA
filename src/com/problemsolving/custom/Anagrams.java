package com.problemsolving.custom;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {

	}

	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

		for (int i = 0; i < A.size(); i++) {
			char[] c = A.get(i).toCharArray();
			Arrays.sort(c);
			String t = String.valueOf(c);
			if (!map.containsKey(t)) {
				ArrayList<Integer> l = new ArrayList<Integer>();
				l.add(i + 1);
				map.put(t, l);
			} else
				map.get(t).add(i + 1);
		}
		
		for (ArrayList<Integer> l : map.values())
			result.add(l);

		return result;
	}

}
