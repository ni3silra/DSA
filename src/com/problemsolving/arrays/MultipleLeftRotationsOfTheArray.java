package com.problemsolving.arrays;

import java.util.ArrayList;

public class MultipleLeftRotationsOfTheArray {

	public static void main(String[] args) {
		int[] a = { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54,
				67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
		int[] b = { 88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75,
				82, 17, 23, 67, 51, 23, 11, 70, 59 };
		ArrayList<Integer> A = new ArrayList<>();
		for (int i : a)
			A.add(i);

		ArrayList<Integer> B = new ArrayList<>();
		for (int i : b)
			B.add(i);
		System.out.println(new MultipleLeftRotationsOfTheArray().solve(A, B));
	}

	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();

		for (int rotateNum : B)
			table.add(leftRotate(A, rotateNum % A.size()));

		return table;
	}

	private ArrayList<Integer> leftRotate(ArrayList<Integer> A, int rotation) {

		reverse(A);

		int partitionNum = A.size() - rotation;

		ArrayList<Integer> part1 = new ArrayList<>();
		ArrayList<Integer> part2 = new ArrayList<>();

		for (int i = 0; i < partitionNum; i++)
			part1.add(A.get(i));

		for (int i = partitionNum; i < A.size(); i++)
			part2.add(A.get(i));

		reverse(part1);
		reverse(part2);
		reverse(A);
		part1.addAll(part2);

		return part1;
	}

	private void reverse(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() / 2; i++)
			swap(list, i, list.size() - i - 1);
	}

	private void swap(ArrayList<Integer> list, int index1, int index2) {
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}

}
