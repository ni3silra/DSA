package com.problemsolving.hashing;

import java.util.*;

public class SortArrayIngivenOrder {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
				new SortArrayIngivenOrder().solve(new int[] { 12, 7 }, new int[] { 7, 1, 6, 17, 2, 19, 10 })));

	}

	public int[] solve(int[] A, int[] B) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int[] newArr = new int[A.length];

		for (int i : A)
			if (map.get(i) == null)
				map.put(i, 1);
			else
				map.put(i, map.get(i) + 1);

		int index = 0;

		for (int num : B) {
			if (map.get(num) != null) {
				for (int i = 0; i < map.get(num); i++) {
					newArr[index++] = num;
				}
				map.put(num, 0);
			}
		}

		ArrayList<Integer> list = new ArrayList<>();

		for (int num : map.keySet()) {
			if (map.get(num) != 0) {
				for (int i = 0; i < map.get(num); i++) {
					list.add(num);
				}
			}
		}

		Collections.sort(list);

		for (int i : list) {
			newArr[index++] = i;
		}
		return newArr;
	}
}
