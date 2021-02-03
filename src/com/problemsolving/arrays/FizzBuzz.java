package com.problemsolving.arrays;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(new FizzBuzz().fizzBuzz(5));
	}

	public ArrayList<String> fizzBuzz(int A) {
		ArrayList<String> list = new ArrayList<>();

		for (int i = 1; i <= A; i++) {

			if (i % 15 == 0)
				list.add("FizzBuzz");
			else if (i % 5 == 0)
				list.add("Buzz");
			else if (i % 3 == 0)
				list.add("Fizz");
			else
				list.add(String.valueOf(i));

		}

		return list;
	}

}
