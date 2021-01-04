package com.problemsolving;

public class Teams {

	public int solve(String A) {
		char[] array = A.toCharArray();
		int count0 = 0, count1 = 0;
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			int noUseVariable = (array[i] == '0') ? count0++ : count1++;
			if (count0 == count1)
				counter++;
		}

		return counter;
	}

	public static void main(String[] args) {
		Teams teams = new Teams();
		System.out.println(teams.solve("011100"));
		System.out.println(teams.solve("00011011"));
	}

}
