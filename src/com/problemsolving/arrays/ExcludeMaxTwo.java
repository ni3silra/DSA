package com.problemsolving.arrays;

public class ExcludeMaxTwo {

	public static void main(String[] args) {
		for (int i : new ExcludeMaxTwo().solve(new int[] { 391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42,
				190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468,
				56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118,
				886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476,
				751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135 }))
			System.out.println(i);
	}

	public int[] solve(int[] A) {

		if (A.length < 2)
			return null;
		else {
			int[] temp = delete(A, findMax(A));
			temp = delete(temp, findMax(temp));
			return temp;
		}
	}

	public int findMax(int[] A) {

		int maxValue = Integer.MIN_VALUE;
		for (int num : A) {
			if (num > maxValue)
				maxValue = num;
		}
		return maxValue;
	}

	public int[] delete(int[] A, int num) {
		int[] temp = new int[A.length - 1];
		int j = 0;
		for (int i : A)
			if (i != num)
				temp[j++] = i;
		return temp;
	}

}
