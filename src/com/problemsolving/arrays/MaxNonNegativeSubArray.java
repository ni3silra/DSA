package com.problemsolving.arrays;

import java.util.*;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();

		for (int i : new int[] { -75249, 43658, 11272, -50878, 37709, 38165, -43042, -22503 }) {
			A.add(i);
		}
		System.out.println(maxset(A));
	}

	public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
		table.add(new ArrayList<Integer>());
		int j = 0;
		for (int i : A) {
			if (i >= 0) {
				table.get(j).add(i);
			} else if (table.get(j).size() > 0) {
				table.add(new ArrayList<Integer>());
				j++;
			}
		}

		HashMap<Long, ArrayList<Integer>> map = new HashMap<Long, ArrayList<Integer>>();

		for (ArrayList<Integer> list : table) {
			long sum = 0l;
			for (int i : list) {
				sum += i;
			}
			map.put(sum, list);
		}

		boolean norZero = true;
		for (ArrayList<Integer> list : map.values()) {
			int sum = 0;
			for(int k : list) {
				sum +=k;
			}
			if(sum != 0) {
				norZero = false;
			}
		}

		if (norZero) {
			ArrayList<Integer> list = new ArrayList<>();
			int sum = 0;

			for (ArrayList<Integer> ai : table)
				if (ai.size() > sum) {
					sum = ai.size();
					list = ai;
				}

			return list;
		}

		long max = 0l;
		ArrayList<Integer> list = new ArrayList<>();
		for (long l : map.keySet()) {

			if (max < l) {
				max = l;
				list = map.get(l);
			}
		}

		return list;
	}

}
