package com.problemsolving.arrays;

import com.datastructure.map.*;

public class FirstRecurringElement {
	private int[] array;

	FirstRecurringElement(int[] array) {
		this.array = array;
	}

	Integer getRepeatedNumberByBruteForce() {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] == array[j])
					counter++;
				if (counter > 1)
					return array[i];
			}
		}

		return null;
	}// TC = O(n^2) , SC = O(1)

	Integer getRepeatedNumberByHashMap() {
		Map<Integer, Integer> map = new HashTable<Integer, Integer>();

		for (int i : array)
			if (map.containsKey(i))
				return i;
			else
				map.put(i, i);

		return null;
	} // TC = O(n) , SC = O(n)

	public static void main(String[] args) {
		FirstRecurringElement firstRecurringElement = new FirstRecurringElement(
				new int[] { 2, 1, 6, 6, 7, 3, 2, 2 });

		System.out.println(
				"First Recurring Character (BruteForce) " + firstRecurringElement.getRepeatedNumberByBruteForce());
		System.out.println(
				"First Recurring Character (HashMap) :- " + firstRecurringElement.getRepeatedNumberByHashMap());
	}

}
