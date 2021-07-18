package com.problemsolving.hashing;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {

		System.out.println(new Anagrams().anagrams(new ArrayList<>(List.of("rat", "art", "tar", "atr"))));
	}

	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		LinkedHashMap<String, ArrayList<Integer>> map = new LinkedHashMap<>();
		int counter = 1;

		for (String s : A) {

			char[] c = s.toCharArray();
			Arrays.sort(c);
			String str = new String(c);
			
			ArrayList<Integer> tempList = null;
		
			if (map.get(str) == null) {
				tempList = new ArrayList<>();
				tempList.add(counter++);
				map.put(str, tempList);
			} else {
				tempList = map.get(str);
				tempList.add(counter++);
				map.put(str, tempList);
			}

		}

		for (String s : map.keySet())
			res.add(map.get(s));
		return res;
	}

	public boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		HashMap<Character, Integer> countMap = new HashMap<>();

		for (char c : str1.toCharArray()) {
			if (countMap.get(c) == null) {
				countMap.put(c, 1);
			} else {
				countMap.put(c, countMap.get(c) + 1);
			}
		}

		for (char c : str2.toCharArray()) {
			if (countMap.get(c) == null) {
				return false;
			} else {
				countMap.put(c, countMap.get(c) - 1);
			}
		}

		for (char c : countMap.keySet()) {
			if (!countMap.get(c).equals(0)) {
				return false;
			}
		}

		return true;
	}

}
