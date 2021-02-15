package com.problemsolving.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Equal {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Equal().equal(new int[] { 3, 4, 7, 1, 2, 9, 8 })));
		// System.out.println(Arrays.toString(new Equal().equal(new int[] { 2, 5, 1, 6
		// })));
	}

	public int[] equal(int[] A) {
		int index_1 = -1;
		int index_2 = -1;
		int index_3 = -1;
		int index_4 = -1;
		if (A.length >= 4) {
			HashMap<Integer, Pair> map = new HashMap<>();
			for (int i = 0; i < A.length; i++) {
				for (int j = i + 1; j < A.length; j++) {
					if (map.get(A[i] + A[j]) == null) {
						map.put(A[i] + A[j], new Pair(i, j));
					} else {
						index_1 = map.get(A[i] + A[j]).first;
						index_2 = map.get(A[i] + A[j]).second;
						if (index_3 == -1) {
							index_3 = i;
							index_4 = j;
						}
						if (index_1 < index_2 && index_3 < index_4 && index_1 < index_3 && index_2 != index_4
								&& index_2 != index_3) {
							index_3 = i;
							index_4 = j;
							System.out.println(index_1 + " " + index_2 + " " + index_3 + " " + index_4);
							// break;
						}

					}
				}
			}
			int[] array = new int[] { index_1, index_2, index_3, index_4 };
			Arrays.sort(array);
			return array;
		}
		return new int[] {};
	}
}

class Pair {

	public int first;
	public int second;

	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
}
