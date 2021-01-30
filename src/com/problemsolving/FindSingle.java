package com.problemsolving;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class FindSingle {

	public static void main(String[] args) {
//		System.out.println(new FindSingle().singleNumber(new int[] { 1, 2, 2, 3, 1 }));
//		System.out.println(new FindSingle().singleNumber(new int[] { 1, 2, 1 }));

	}

	public int singleNumber(final List<Integer> A) {

//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int i : A) {
//			if (!map.containsKey(i))
//				map.put(i, 1);
//			else
//				map.put(i, map.get(i) + 1);
//		}
//
//		for (Entry<Integer, Integer> entry : map.entrySet())
//			if (entry.getValue() == 1)
//				return entry.getKey();

		int temp = 0;
		for (int num : A)
			temp = temp ^ num;
		return temp;
	}

}
