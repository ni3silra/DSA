package com.algorithms.dp;

import java.util.HashMap;

public class Factorial {

	HashMap<Integer, Long> map;
	static int calculations;

	Factorial() {
		map = new HashMap<>();
		map.put(0, 1L);
		map.put(1, 1L);
		calculations = 0;
	}

	long getFactorialFromDP(int number) {

		if (map.containsKey(number))
			return map.get(number);
		else {
			calculations++;
			long fact = number * getFactorialFromDP(--number);
			map.put(number, fact);
			return fact;
		}
	} // O(n)

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("Recursive Output " + factorial.getFactorialFromDP(23));
		System.out.println(calculations);
	}

}
