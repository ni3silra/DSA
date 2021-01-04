package com.algorithms.sorting;

import com.utilites.Utilites;

public class BubbleSort implements Sort {

	Object[] array;

	public BubbleSort(Object[] array) {
		super();
		this.array = array;
	}

	@Override
	public Object[] sort() {
		for (int j = 0; j < array.length; j++)
			for (int i = 1; i < array.length - j; i++)
				if (Utilites.compareTo(array[i - 1], array[i]) == 1)
					swap(i - 1, i);
		return array;
	}

	private void swap(int index1, int index2) {
		Object temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
