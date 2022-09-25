package com.problemsolving.arrays;

import java.util.ArrayList;

public class AntiDiagonals {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		// new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// new int[][] { { 1, 2 }, { 3, 4 } }

		int start = 0;
		for (int[] array : new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }) {
			list.add(new ArrayList<Integer>());
			for (int i : array) {
				list.get(start).add(i);
			}
			start++;
		}

		System.out.println(new AntiDiagonals().diagonal(list));

	}

	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

		int M = A.size();
		int N = A.get(0).size();

		int start = 0;

		while (output.size() < 2 * M - 1)
			output.add(new ArrayList<>());

		for (int col = 0; col < N; col++) {
			int startcol = col, startrow = 0;
			while (startcol >= 0 && startrow < N)
				output.get(start).add(A.get(startrow++).get(startcol--));
			start++;
		}

		for (int row = 1; row < N; row++) {
			int startrow = row, startcol = N - 1;
			while (startrow < N && startcol >= 0)
				output.get(start).add(A.get(startrow++).get(startcol--));
			start++;
		}
		
		return output;
	}

}
