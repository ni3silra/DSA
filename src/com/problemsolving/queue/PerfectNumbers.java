package com.problemsolving.queue;

import java.util.*;

public class PerfectNumbers {

	public static void main(String[] args) {
		System.out.println(new PerfectNumbers().solve(4));
	}

	public String solve(int A) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(1);
		queue.add(2);

		int c = 0;
		while (c < A) {
			int num = queue.poll();
			queue.add(10 * num + 1);
			c++;
			if (c == A)
				break;
			queue.add(10 * num + 2);
			c++;
		}

		return String.valueOf(queue.poll());

	}

	static boolean isSubSequence(String A, String B, int m, int n) {

		int j = 0;
		for (int i = 0; i < n && j < m; i++)
			if (A.charAt(j) == B.charAt(i))
				j++;
		return (j == m);
	}

}
