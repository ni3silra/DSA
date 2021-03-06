package com.problemsolving.custom;

import java.util.ArrayList;
import java.util.List;

public class DiscountedPrice {

	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<>();

		for (int i : new int[] { 1, 2, 3, 4 })
			prices.add(i);

		System.out.println(calculateAmount(prices));
	}

	public static long calculateAmount(List<Integer> prices) {
		long totalPrice = prices.get(0);
		long minAmount = Integer.MAX_VALUE;

		for (int i : prices)
			if (i < minAmount)
				minAmount = i;

		for (int i = 1; i < prices.size(); i++)
			if (prices.get(i) != minAmount)
				if (prices.get(0) == minAmount)
					totalPrice += prices.get(i) - prices.get(0);
				else
					totalPrice += prices.get(i) - prices.get(i - 1);

		return totalPrice;
	}

}
