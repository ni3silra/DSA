package com.problemsolving.recursion;

import java.util.*;

public class SubSet {

	public static void main(String[] args) {
		System.out.println(new SubSet().subsets(new ArrayList<Integer>(Arrays.asList(1, 2, 2))));
	}

	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		Collections.sort(A);
		return gererateSubSet(A, new ArrayList<ArrayList<Integer>>(), new ArrayList<Integer>(), 0);
	}

	private ArrayList<ArrayList<Integer>> gererateSubSet(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> subset, int index) {

		res.add(new ArrayList<Integer>(subset));

		for (int i = index; i < A.size(); i++) {
			subset.add(A.get(i));
			gererateSubSet(A, res, subset, i + 1);
			subset.remove((Integer) A.get(i));
		}

		return res;
	}

}
