package com.algorithms.searching;

import com.algorithms.sorting.BubbleSort;
import com.utilites.Utilities;

public class BinarySearch implements Search {

	Object[] array;

	public BinarySearch(Object[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean find(Object obj) {
		array = new BubbleSort(array).sort();
		int index = binarySearch(obj, 0, array.length - 1);
		// boolean found = binarySearch(obj);

		if (index != -1)
			return true;
		return false;
	}

	// recursion
	private int binarySearch(Object obj, int startIndex, int lastIndex) {

		if (startIndex > lastIndex)
			return -1;

		int midIndex = (startIndex + lastIndex) / 2;

		int decider = Utilities.compareTo(array[midIndex], obj);

		if (decider == 0)
			return midIndex;
		else if (decider == 1)
			return binarySearch(obj, startIndex, midIndex - 1);
		else
			return binarySearch(obj, midIndex + 1, lastIndex);
	} // O(log n)

	// iterative
	private boolean binarySearch(Object obj) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			int decider = Utilities.compareTo(array[mid], obj);
			if (decider == 0)
				return true;
			else if (decider == 1)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return false;
	}

//	public static void main(String[] args) {
//		System.out.println(new BinarySearch(new Integer[] { 1, 2, 3, 4 }).binarySearch(3));
//	}

}
