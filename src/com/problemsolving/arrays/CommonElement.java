package com.problemsolving.arrays;

import java.util.ArrayList;

public class CommonElement {

	public static void main(String[] args) {
		int[] a = { 2, 1, 10, 10 };
		int[] b = { 3, 6, 2, 10, 10 }; // {2,10}

		int[] a1 = { 2, 7, 1, 2 };
		int[] b1 = { 1, 3, 4, 6, 2 }; // {1,2,2}

		ArrayList<Integer> A = new ArrayList<>();

		for (int i : a1)
			A.add(i);
		ArrayList<Integer> B = new ArrayList<>();
		for (int i : b1)
			B.add(i);

		System.out.println(new CommonElement().solve(A, B));

	}

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

		A.retainAll(B);
		B.retainAll(A);
		A.retainAll(B);
		return A.size() > B.size() ? B : A;
	}

}
