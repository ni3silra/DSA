package com.problemsolving.arrays;

public class BuySellStock {

    public static void main(String[] args) {
        System.out.println(getProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int getProfit(int[] array) {
        int profit = 0, buyDay = 0, max = 0;
        for (int i = 0; i < array.length; i++)
            profit += buyDay++ + max++;
        return profit;
    }

    public static int getProfit2(int[] array) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int currentPrice : array) {
            if (currentPrice < minPrice)
                minPrice = currentPrice;
            else
                maxProfit = Math.max(maxProfit, currentPrice - minPrice);
        }
        return maxProfit;
    }

}
