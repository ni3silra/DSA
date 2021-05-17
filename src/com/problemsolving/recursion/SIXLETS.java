package com.problemsolving.recursion;

import java.util.*;

public class SIXLETS {

	public static void main(String[] args) {
		System.out.println(new SIXLETS()
				.solve(new ArrayList<Integer>(Arrays.asList(508, 503, 412, 895, 256, 89, 245, 567, 9, 123)), 5));
	}

	public int solve(ArrayList<Integer> A, int B) {
		int count = 0;
		int n = A.size();

		for (ArrayList<Integer> l : subsets(A)) {
			int sum = 0;

			if (l.size() == B) {
				System.out.println(l);
				for (int i = 0; i < B; i++)
					sum += A.get(i);

				if (sum <= 1000)
					count++;
			}
		}

		return count;
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
