package com.problemsolving.custom;

public class FlagStone {

	public static void main(String[] args) {
		System.out.println(solve(6, 6, 4));
	}

	public static int solve(int A, int B, int C) {
		return (int) (Math.ceil((double) ((double) A / (double) C)) * Math.ceil((double) ((double) B / (double) C)));
	}
}
