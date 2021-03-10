package com.problemsolving.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CommonElement {

	public static void main(String[] args) {
		int[] a = { 2, 1, 10, 10 };
		int[] b = { 3, 6, 2, 10 }; // Answer should be {2,10} but I am getting {2,10,10}

		int[] a1 = { 2, 7, 1, 2 };
		int[] b1 = { 1, 3, 4, 6, 2, 2 }; // {1,2,2}

		ArrayList<Integer> A = new ArrayList<>();

		for (int i : a1)
			A.add(i);
		ArrayList<Integer> B = new ArrayList<>();
		for (int i : b1)
			B.add(i);
		System.out.println(new CommonElement().solve(A, B));
	}

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();

		for (int i : A) {
			if (map1.get(i) != null) {
				map1.put(i, map1.get(i) + 1);
			} else {
				map1.put(i, 1);
			}
		}

		for (int i : B) {
			if (map2.get(i) != null) {
				map2.put(i, map2.get(i) + 1);
			} else {
				map2.put(i, 1);
			}
		}

		for (int i : map1.keySet()) {
			if (map2.get(i) != null) {
				int count1 = map1.get(i);
				int count2 = map2.get(i);
				int count = count1 < count2 ? count1 : count2;
				for (int j = 0; j < count; j++) {
					output.add(i);
				}

			}
		}

		return output;
	}

}