/*
 * Little pony is going to buy some mobile phones for his friends. As there many models available in the market at different prices, He is confused and wants to know the maximum distinct models of a mobile phone he can buy for his friends, given that he has a total X amount of money.
 * You are given an array A of size N. denoting the size of prices of different models. The array is sorted based on prices in increasing order. You are given another array B of size Q denoting the queries. In i'th query, you need to tell the maximum distinct models of mobile phones he can buy with B[i] money.
 */

package com.problemsolving;

import java.util.*;

public class LittlePonnyandMobilePhones {

	public static void main(String[] args) {
		int[] A = { 3, 4, 4, 6 };
		int[] B = { 20, 4, 10, 2 };
		ArrayList<Integer> aList = new ArrayList<>();
		ArrayList<Integer> bList = new ArrayList<>();

		for (int i : A)
			aList.add(i);

		for (int i : B)
			bList.add(i);

		System.out.println(new LittlePonnyandMobilePhones().betterSolve(aList, bList));

	}

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int totalMoney : B) {

			int numberOfMobilePurchased = 0;
			int acquiredMoney = 0;

			for (int price : A) {
				acquiredMoney += price;

				if (acquiredMoney < totalMoney)
					numberOfMobilePurchased++;
			}
			list.add(numberOfMobilePurchased);
		}

		return list;
	}

	public ArrayList<Integer> betterSolve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> list = new ArrayList<>();
		return list;
	}

}
