package com.datastructure.array;

import com.algorithms.sorting.BubbleSort;

public final class Arrays<E> {

	public static <E> boolean contains(Object[] array, E element) {

		return false;
	}

	public static Object[] sort(Object[] array) {
		return new BubbleSort(array).sort();
	}

	public static Object[] delete(Object[] array, int index) {
		Object[] tempArray = new Object[array.length];
		tempArray = array;

		int newLength = array.length - 1;
		array = new Object[newLength];

		tempArray[index] = null;

		int counter = 0;
		for (int i = 0; i <= newLength; i++) {
			if (tempArray[i] != null)
				array[counter++] = tempArray[i];
		}
		return array;
	} // O(n)

	public static String toString(Object[] a) {
		if (a == null)
			return "null";

		int lastIndex = a.length - 1;
		if (lastIndex == -1)
			return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(String.valueOf(a[i]));
			if (i == lastIndex)
				return b.append(']').toString();
			b.append(", ");
		}
	}
}
