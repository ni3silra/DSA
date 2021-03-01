package com.problemsolving.math;

public class MagicNumber {

	public static void main(String[] args) {
		System.out.println(new MagicNumber().solve(6)); // 150
	}

	public int solve(int A) {

		int pow = (int) Math.pow(5, A);

		return pow;
	}

}
