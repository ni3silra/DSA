package com.problemsolving.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SubSetWithoutDup {

	public static void main(String[] args) {
		System.out.println(new SubSetWithoutDup().subsets(new ArrayList<Integer>(Arrays.asList(1, 2, 2))));
	}

	public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		HashSet<ArrayList<Integer>> set = new HashSet<>();
		for (ArrayList<Integer> l : subsets(A))
			if (set.add(l))
				ans.add(l);
		return ans;
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
