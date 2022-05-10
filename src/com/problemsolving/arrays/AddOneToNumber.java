package com.problemsolving.arrays;

import java.util.ArrayList;

public class AddOneToNumber {

	public static void main(String[] args) {

		int[] a = { 0, 6, 0, 6, 4, 8, 8, 1 };
		ArrayList<Integer> A = new ArrayList<>();
		for (int i : a)
			A.add(i);

		System.out.println(new AddOneToNumber().plusOne(A));

	}

	public int[] plusOne(int[] digits){
		for(int i = digits.length ; i>= 0; i--){
			if(digits[i] < 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		int[] results = new int[digits.length +1];
		results[0] = 1;
		return results;
	}



	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		ArrayList<Integer> ans = A;

		boolean isCarryAvailable = false;

		for (int i = A.size() - 1; i >= 0; i--) {

			int digit = A.get(i);

			if (i == A.size() - 1)
				digit++;

			if (isCarryAvailable)
				digit++;

			if (digit - 10 >= 0)
				isCarryAvailable = true;
			else
				isCarryAvailable = false;

			ans.set(i, digit % 10);

		}
		//
		if (isCarryAvailable) {
			ans.add(0);
			ans.set(0, 1);
			for (int i = 1; i < ans.size() - 1; i++)
				ans.set(i, ans.get(i + 1));

		} else {  
			for (int i = 0; i < ans.size(); i++) {
				if (ans.get(0) == 0)
					ans.remove(0);
				else
					break;
			}
		}

		return ans;
	}

}
