package com.problemsolving.sorting;

import java.util.*;

public class GameOfBottles {

	public static void main(String[] args) {
		System.out.println(new GameOfBottles().solve(new int[] { 1, 2, 3 }));
		System.out.println(new GameOfBottles().solve(new int[] { 1, 1 }));
		System.out.println(new GameOfBottles().solve(new int[] { 8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16,
				3, 8, 17, 12, 5, 3, 14, 13, 3, 2, 17, 19, 16, 8, 7, 12, 19, 10, 13, 8, 20, 16, 15, 4, 12, 3 }));
	}

	public int solve(int[] A) {
		Arrays.sort(A);

		int n = A.length;
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : A)
			if (map.get(i) == null)
				map.put(i, 0);
			else
				map.put(i, map.get(i) + 1);

		while (map.size() != 1) {
			for (int i : map.keySet())
				if (map.get(i) == 0) {
					map.remove(i);
				} else {
					map.put(i, map.get(i) - 1);
				}
			count++;
		}
		
		System.out.println(map.toString());
//
//		for (int i = 0; i < n - 1; i++) {
//			if (A[i] == A[i + 1]) {
//				count++;
//				i++;
//			}
//		}

		return count + 1;
	}

}
