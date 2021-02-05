package com.problemsolving.arrays;

import org.jetbrains.annotations.NotNull;

import java.util.*;

//2
//4 1 2 3 4
//2
//3 1 2 4
//1

public class RotationGame {

	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int testCases = Integer.parseInt(scanner.nextLine());

		for (int cases = 0; cases < testCases; cases++) {

			String[] input = scanner.nextLine().split(" ");

			ArrayList<Integer> list = new ArrayList<>();

			for (String s : input) {
				list.add(Integer.parseInt(s));
			}

			int shiftNum = Integer.parseInt(scanner.nextLine());

			for (int output : new RotationGame().rightRotate(list, shiftNum))
				System.out.println(output);
		}

	}

	private ArrayList<Integer> rightRotate(ArrayList<Integer> A, int rotation) {
		A.remove(0);
		reverse(A);

		int partitionNum = rotation % A.size();

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

	private void swap(@NotNull ArrayList<Integer> list, int index1, int index2) {
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}

}
