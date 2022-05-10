package com.problemsolving.arrays;

public class PaintHouse {

    public static void main(String[] args) {
        int[][] costs = new int[3][3];

        costs[0] = new int[]{17, 2, 17};
        costs[1] = new int[]{16,16, 5};
        costs[2] = new int[]{17, 3, 19};

        System.out.println(new PaintHouse().minCost(costs));
    }

    int minCost(int[][] costs){
        int finalCost = 0;
        for(int[] row : costs) {
         int minCost = Integer.MAX_VALUE;
            for (int cost : row)
                minCost = Math.min(cost,minCost);
            finalCost+=minCost;
        }
        return finalCost;
    }
}
