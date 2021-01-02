package com.algorithms.recursion;

public class Test {

	void recursion(int i) {
		if (i == 0)
			return;
		recursion(i - 1);
		System.out.println(i);

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.recursion(5);

	}

}
