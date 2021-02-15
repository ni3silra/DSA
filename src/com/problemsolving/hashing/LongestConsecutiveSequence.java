package com.problemsolving.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<>();

		for (int i : new int[] { 1, 2 })
			A.add(i);

		System.out.println(new LongestConsecutiveSequence().longestConsecutive(A));
	}

	public int longestConsecutive(final List<Integer> A) {
		Collections.sort(A);
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		int previous = A.get(0);
		int count = 0;
		int largest = 0;

		for (int i = 1; i < A.size(); i++)
			set.add(A.get(i));

		for (int current : set) {
			if (current - previous == 1)
				count++;
			else
				count = 0;
			largest = largest > count ? largest : count;
			previous = current;
		}

		return largest + 1;
	}
}
