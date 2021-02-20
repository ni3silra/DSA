package com.problemsolving.string;

// count the bob
public class CountOccurrences {

	public static void main(String[] args) {
		System.out.println(new CountOccurrences()
				.solve("rbobobbobljzjdbobbobpncbobobobadbobvlrrbobmypibobbqiycbobdcpbobybobgjqgbobuccboboybobmbob"));
	}

	public int solve(String A) {
		int countBob = 0;
		char[] arr = A.toCharArray();
		for (int i = 2; i < arr.length; i++)
			if (arr[i - 2] == 'b' && arr[i - 1] == 'o' && arr[i] == 'b')
				countBob++;
		return countBob;
	}
}
