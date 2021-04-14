package com.problemsolving.math;

import java.util.ArrayList;
import java.util.List;

public class CountOfDivisors {

	public static void main(String[] args) {
		System.out.println(new CountOfDivisors().solve2(new ArrayList<>(List.of(8, 9, 10))));

	}

	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int num : A) {
			int count = 0;
			for (int i = 1; i * i <= num; i++) {
				if (i * i == num)
					count++;
				else if (num % i == 0)
					count += 2;
			}
			ans.add(count);
		}

		return ans;
	}

	public ArrayList<Integer> solve2(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] array = new int[1000001];

		// pre processing start
		for (int i = 1; i < 1000001; ++i)
			array[i] = i;

		for (int i = 2; i * i < 1000001; ++i)
			if (array[i] == i)
				for (int j = i * i; j < 1000001; j += i)
					if (array[j] == j)
						array[j] = i;
		// pre processing end

		for (int num : A) {
			int answer = 1;
			while (num != 1) {
				int count = 1;
				int d = array[num];
				while (num != 1 && num % d == 0) {
					count++;
					num = num / d;
				}
				answer = answer * count;
			}
			ans.add(answer);
		}

		return ans;
	}

}
