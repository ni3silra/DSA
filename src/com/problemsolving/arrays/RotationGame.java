package com.problemsolving.arrays;

import java.util.*;

//2
//4 1 2 3 4
//2
//3 1 2 4
//1

public class RotationGame {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int testCases = scanner.nextInt();

		for (int cases = 0; cases < testCases; cases++) {

			String input[] = scanner.nextLine().split(" ");

			int[] array = new int[input.length];
			int i = 0;

			for (String s : input) {
				array[i++] = Integer.parseInt(s);
			}

			int shiftNum = scanner.nextInt();

			for (int output : new RotationGame().getRotatedArray(array, shiftNum))
				System.out.println(output);
		}

	}

	private int[] getRotatedArray(int[] array, int shiftNum) {
		return null;
	}

}
