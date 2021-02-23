package com.problemsolving.arrays;

import java.util.ArrayList;

public class PickFromBothSides {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		int B = 32;
		for (int i : new int[] { -584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645,
				185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535,
				-550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832,
				-982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703,
				518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23,
				972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730,
				170, -765, -167, 711, 760, -104, -333 }) {
			A.add(i);
		}
		System.out.println(solve(A, B));
	}

	public static int solve(ArrayList<Integer> A, int B) {
		ArrayList<Integer> prefixSum = new ArrayList<Integer>();
		ArrayList<Integer> suffixSum = new ArrayList<Integer>();

		int sum = 0;
		for (int i = 0; i < A.size(); i++) {
			sum += A.get(i);
			prefixSum.add(sum);
			suffixSum.add(0);
		}

		sum = 0;
		for (int i = A.size() - 1; i >= 0; i--) {
			sum += A.get(i);
			suffixSum.set(A.size() - 1 - i, sum);
		}
		suffixSum.add(0);
		sum = Integer.MIN_VALUE;
		int i = B - 1;
		int j = -1;
		while (i > -2) {
			int newSum = Integer.MIN_VALUE;

			if (i == B - 1) {
				newSum = prefixSum.get(i);
			} else if (i == -1) {
				newSum = suffixSum.get(j);
			} else {
				newSum = prefixSum.get(i) + suffixSum.get(j);
			}

			if (sum < newSum)
				sum = newSum;
			i--;
			j++;
		}

		return sum;
	}

}
