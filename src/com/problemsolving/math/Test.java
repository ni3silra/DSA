package com.problemsolving.math;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int l = 521139;
		int r = 879240;

		ArrayList<Integer> listS = new ArrayList<Integer>();
		ArrayList<Integer> listC = new ArrayList<Integer>();
		for (int i = l; i <= r; i++)
			if (isPerfactSquare(i))
				listS.add(i);

		for (int i = l; i <= r; i++)
			if (isPerfactCube(i))
				listC.add(i);

		Collections.sort(listS);
		Collections.sort(listC);

		System.out.print(listC.get(listC.size() - 1) - listS.get(0));

	}

	static boolean isPerfactSquare(int i) {
		int p = (int) Math.sqrt(i);

		return p * p == i;
	}

	static boolean isPerfactCube(int i) {
		int p = (int) Math.cbrt(i);

		return p * p * p == i;
	}
}
