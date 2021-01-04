package com.problemsolving;

import java.util.Scanner;

public class AlternatingCharacters {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		// To do
		char charA = 'A';
		char charB = 'B';
		char[] array = s.toCharArray();
		int diff=0;

		for (int i = 1; i < array.length; i++) {
			if(charA ==array[i-1] && charB == array[i])
				;
			else
				diff++;
				
		}

		return 0; // to do 
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();
			int result = alternatingCharacters(s);
			System.out.println(String.valueOf(result));
		}

		scanner.close();
	}
}
