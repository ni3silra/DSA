package com.problemsolving.arrays;

import java.util.HashSet;

public class SubArrayWith0Sum {

	public static void main(String[] args) {
		System.out.println(new SubArrayWith0Sum().solve(
				new int[] { 862, -411, -552, -549, 918, 434, 29, -437, 121, -640, -168, -961, 929, -427, 372, 984, 488,
						-756, 674, -149, 945, 566, 391, -970, -44, 689, -128, -326, 43, -312, 469, 817, -349, 260, 590,
						-106, -700, 484, -735, -423, 660, 450, -1148, -237, -844, 62, 513, 506, 382, 77, 244, 335 }));
	}

	public int solve(int[] A) {
		HashSet<Long> set = new HashSet<>();
		set.add(0L);
		Long current_sum = 0L;
		for (int i : A) {
			current_sum += i;
			if (set.contains(current_sum))
				return 1;
			set.add(current_sum);
		}
		return 0;
	}

}
