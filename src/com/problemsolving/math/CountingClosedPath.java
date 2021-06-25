package com.problemsolving.math;

import java.util.ArrayList;

public class CountingClosedPath {

	public static void main(String[] args) {
		System.out.println(closedPaths(649578));
	}

	public static int closedPaths(int number) {

		int total = 0;

		do {
			int temp = number % 10;

			switch (temp) {
			case 0:
				total++;
				break;
			case 4:
				total++;
				break;
			case 6:
				total++;
				break;
			case 8:
				total += 2;
				break;
			case 9:
				total++;
				break;
			default:
				// nothing to do
			}

			number /= 10;
		} while (number > 0);

		return total;
	}

}
