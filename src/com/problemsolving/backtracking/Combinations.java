package com.problemsolving.backtracking;

import java.util.ArrayList;

public class Combinations {

	public static void main(String[] args) {
		System.out.println(new Combinations().combine(3, 3));
	}

	ArrayList<ArrayList<Integer>> res;

	void init() {
		res = new ArrayList<>();
	}

	public ArrayList<ArrayList<Integer>> combine(int A, int B) {
		init();
		getCombination(A, B, 1, new ArrayList<>());
		return res;
	}

	public void getCombination(int A, int B, int start, ArrayList<Integer> currList) {
		if (currList.size() == B) {
			res.add(new ArrayList<>(currList));
			return;
		}

		for (int i = start; i <= A; i++) {
			currList.add(i);
			getCombination(A, B, i + 1, currList);
			currList.remove((Integer) i);
		}

	}

}
