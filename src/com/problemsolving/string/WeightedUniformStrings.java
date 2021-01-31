package com.problemsolving.string;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		String s = "l";
		for (String str : weightedUniformStrings(s, new int[] { 1, 12 }))
			System.out.println(str);
	}

	static String[] weightedUniformStrings(String s, int[] queries) {
		String[] list = new String[queries.length];
		int[] allChar = new int[27];

		allChar[0] = 0;

		for (char c : s.toCharArray())
			if (c >= 97 && c <= 122)
				allChar[c - 96] += c - 96;

		for (int i = 0; i < queries.length; i++) {
			list[i] = "No";
		}

		for (int i = 1; i < allChar.length; i++)
			if (allChar[i] != 0)
				for (int j = 0; j < queries.length; j++)
					if (queries[j] != 1 && allChar[i] % queries[j] == 0)
						list[j] = "Yes";
					else if (queries[j] == 1 && s.contains("a"))
						list[j] = "Yes";

		return list;
	}

}
