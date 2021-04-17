package com.algorithms.sorting;

import java.util.Arrays;

import com.utilites.Utilites;

public class MergeSort implements Sort {

	Object[] array;

	public MergeSort(Object[] array) {
		this.array = array;
	}

	@Override
	public Object[] sort() {
		mergeSort(array, 0, array.length);
		return array;
	}

	public void mergeSort(Object[] obj, int startIndex, int endIndex) {
		System.out.println(Arrays.toString(obj) + " " + startIndex + " " + endIndex);
		if (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			mergeSort(obj, startIndex, midIndex);
			mergeSort(obj, midIndex + 1, endIndex);
			conquer(obj, startIndex, midIndex, endIndex);
		}

	}

	public Object[] divide(Object[] obj, int startIndex, int endIndex) {
		return divide(obj, startIndex, endIndex);
	}

	public void conquer(Object[] obj, int startIndex, int midIndex, int endIndex) {

		int n1 = midIndex - startIndex + 1;
		int n2 = endIndex - midIndex;

		Object[] a = new Object[n1];
		Object[] b = new Object[n2];

		for (int i = 0; i < n1; i++)
			a[i] = obj[startIndex + i];

		for (int i = 0; i < n2; i++)
			b[i] = obj[midIndex + 1 + i];

		int i = 0;
		int j = 0;
		int k = startIndex;

		while (i < n1 && j < n2) {
			if (Utilites.compareTo(obj[i], obj[j]) == 1)
				obj[k++] = a[i++];
			else
				obj[k++] = b[j++];
		}

		while (i < n1)
			obj[k++] = a[i++];

		while (i < n2)
			obj[k++] = b[i++];

	}

	public static void main(String[] args) {
		new MergeSort(new Integer[] { 5, 2, 4, 6, 8, 3, 7, 9 }).sort();
	}

}
