package com.problemsolving.arrays;

import java.util.*;

public class NextPermutation {

	public static void main(String[] args) {
		System.out.println(new NextPermutation().nextPermutation(new ArrayList<>(
				List.of(444, 994, 508, 72, 125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675, 424, 199, 201,
						788, 609, 582, 979, 259, 901, 371, 766, 759, 983, 728, 220, 16, 158, 822, 515, 488, 846, 321,
						908, 469, 84, 460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202, 734, 128, 312, 499,
						274, 213, 208, 472, 265, 315, 335, 205, 784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226,
						351, 241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856, 701, 319, 695, 52))));
	}

	public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
		int n = A.size();
		int changePosition = -1;

		if (n <= 1) {
			return A;
		}

		for (int i = n - 1; i > 0; i--) {
			int num1 = A.get(i);
			int num2 = A.get(i - 1);
			if (num1 > num2) {

				// find the closest one of A[changePosition]
				int diff = Integer.MAX_VALUE;
				int x = A.get(i - 1);
				int idx = -1;
				for (int j = i; j < n; j++) {
					int d = A.get(j) - x;
					if (d > 0 && d < diff) {
						diff = d;
						idx = j;
					}
				}
				swap(A, idx, i - 1); // swap with closest greater

				changePosition = i;
				break;
			}
		}

		if (changePosition != -1) {
			int i = changePosition, j = n - 1;
			while (i <= j) {
				swap(A, i, j);
				i++;
				j--;
			}
		} else {
			/*
			 * for (int i = 0; i < n / 2; i++) { swap(A, i, n - i - 1); }
			 */
			Collections.sort(A);
		}

		return A;
	}

	public void swap(ArrayList<Integer> A, int index1, int index2) {
		int temp = A.get(index1);
		A.set(index1, A.get(index2));
		A.set(index2, temp);
	}

}
