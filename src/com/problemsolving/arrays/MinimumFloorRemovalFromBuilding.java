package com.problemsolving.arrays;

import java.util.Arrays;

public class MinimumFloorRemovalFromBuilding {

    public static void main(String[] args) {
        System.out.println(getMinimumRemovalFromBuilding(new int[]{7, 3, 5})); // 5
        System.out.println(getMinimumRemovalFromBuilding(new int[]{99, 2, 3, 5})); // 10
        System.out.println(getMinimumRemovalFromBuilding(new int[]{7, 5, 6})); //  3
        System.out.println(getMinimumRemovalFromBuilding(new int[]{3, 3, 3})); // 0

        System.out.println(getMinimumRemovalFromBuildingOptimal(new int[]{7, 3, 5})); // 5
        System.out.println(getMinimumRemovalFromBuildingOptimal(new int[]{99, 2, 3, 5})); // 10
        System.out.println(getMinimumRemovalFromBuildingOptimal(new int[]{7, 5, 6})); //  3
        System.out.println(getMinimumRemovalFromBuildingOptimal(new int[]{3, 3, 3})); // 0
    }

    /*
     *  2 3 5 99
     *  7 6 5
     * Find the Floor size ->
     * min of removal array
     *
     */

    private static int getMinimumRemovalFromBuilding(int[] heights) {
        int minRemoval = Integer.MAX_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int currentRemoval = 0;
            for (int j = 0; j < heights.length; j++) {
                if (i != j) {
                    if (heights[i] <= heights[j]) {
                        currentRemoval += heights[j] - heights[i];
                    } else {
                        currentRemoval += heights[j];
                    }
                }
            }
            minRemoval = Math.min(currentRemoval, minRemoval);
        }
        return minRemoval;
    }

    private static int getMinimumRemovalFromBuildingOptimal(int[] heights) {
       if(heights == null || heights.length == 0)
           return 0;
        Arrays.sort(heights);
        int[] pre = getPreFixSum(heights);
        int[] post = getPostFixSum(heights);
        int minRemoval = Integer.MAX_VALUE;
        for (int i = 0; i < heights.length; i++)
            minRemoval = Math.min(getCurrRemoval(heights, pre, post, i), minRemoval);
        return minRemoval;
    }

    private static int getCurrRemoval(int[] heights, int[] pre, int[] post, int i) {
        return pre[i] + post[i] - 2 * heights[i] - (heights[i] * (heights.length - 1 - i));
    }

    private static int[] getPostFixSum(int[] heights) {
        int[] post = new int[heights.length];
        post[heights.length-1] = heights[heights.length-1];
        for (int i = heights.length -2; i >=0; i--) {
            post[i] = post[i+1] + heights[i];
        }
        return post;
    }

    private static int[] getPreFixSum(int[] heights) {
        int[] pre = new int[heights.length];
        pre[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            pre[i] = pre[i-1] + heights[i];
        }
        return pre;
    }
}
