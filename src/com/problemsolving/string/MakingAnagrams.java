package com.problemsolving.string;

import java.util.*;

public class MakingAnagrams {

	public static void main(String[] args) {
		System.out.println(
				makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
	}

	static int makingAnagrams(String s1, String s2) {

		HashMap<Character, Integer> map1 = getMap(s1);
		HashMap<Character, Integer> map2 = getMap(s2);

		return (map1.size() > map2.size()) ? getRepeatCount(map1, map2) : getRepeatCount(map2, map1);
	}

	static HashMap<Character, Integer> getMap(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray())
			if (map.get(c) == null)
				map.put(c, 1);
			else
				map.put(c, map.get(c) + 1);

		return map;
	}

	static int getRepeatCount(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
		int ans = 0;
		for (Character c : map1.keySet())
			if (map2.get(c) == null)
				ans++;
			else
				ans += Math.abs(map1.get(c) - map2.get(c));
		return ans;
	}

}
