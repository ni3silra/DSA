package com.algorithms.searching;

import com.utilites.Utilites;

public class BinarySearch implements Search {

	Object[] array;

	public BinarySearch(Object[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean find(Object obj) {
		if (binarySearch(obj, 0, array.length) != -1)
			return true;
		return false;
	}

	private int binarySearch(Object obj, int startIndex, int lastIndex) {

		if (startIndex > lastIndex)
			return -1;

		int midIndex = (startIndex + lastIndex) / 2;

		int decider = Utilites.compareTo(array[midIndex], obj);

		if (decider == 0)
			return midIndex;
		else if (decider == -1)
			return binarySearch(obj, startIndex, midIndex - 1);
		else
			return binarySearch(obj, midIndex + 1, lastIndex);

	}

}
