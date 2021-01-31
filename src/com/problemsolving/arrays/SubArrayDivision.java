package com.problemsolving.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {

	public static void main(String[] args) {

		List<Integer> s = new ArrayList<>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);

		birthday(s, 3, 2);
//		System.out.println(birthday(s, 3, 2));

	}

	static int birthday(List<Integer> s, int d, int m) {

		if (s.size() == 1 && m == 1)
			if (s.get(0) == d)
				return 1;

		int out = 0;
		int index = s.size() - 1;
		while (index == 0) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += s.get(index--);
				if (d == sum) {
					out++;
					index += m;
					break;
				}
			}
		}
		System.out.println("Out :- " + out / 2);
		return out / 2;
	}

}
