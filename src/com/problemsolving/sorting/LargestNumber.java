package com.problemsolving.sorting;

import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String largestNumber(final List<Integer> A) {
		List<String> list = new ArrayList<String>();

		for (int i : A)
			list.add(i + "");
		Collections.sort(list, new MyCompare());

		StringBuffer sb = new StringBuffer();

		for (String s : list)
			sb.append(s);

		if (sb.length() < 10)
			if (Long.parseLong(sb.toString()) == 0L) {
				sb = new StringBuffer("0");
			}
		return sb.toString();
	}
}

class MyCompare implements Comparator<String> {
	@Override
	public int compare(String X, String Y) {
		return (X + Y).compareTo(Y + X) > 0 ? -1 : 1;
	}
}
