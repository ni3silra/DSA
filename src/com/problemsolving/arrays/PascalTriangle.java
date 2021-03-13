package com.problemsolving.arrays;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println(new PascalTriangle().generate(5));
	}

	public ArrayList<Integer> generate(int A) {
		int numRows = A + 1;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		res.add(new ArrayList<>());
		res.get(0).add(1);

		for (int i = 1; i < numRows; i++) {

			res.add(new ArrayList<>());

			res.get(i).add(1);

			for (int j = 0; j < i - 1; j++) {
				int num = res.get(i - 1).get(j) + res.get(i - 1).get(j + 1);
				res.get(i).add(num);
			}

			res.get(i).add(1);

		}

		return res.get(res.size() - 1);
	}
}
