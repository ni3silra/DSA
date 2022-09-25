package com.problemsolving.custom;

public class GasStation {

    /*
     * [5,8,2,8]
     * [6,5,6,6]
     */
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }


    public static int canCompleteCircuit(int[] A, int[] B) {
        int resIndex = 0;
        int totalSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            totalSum += B[i] - A[i];
            if (max < A[i]) {
                max = A[i];
                resIndex = i;
            }
        }
        return totalSum >= 0 ? resIndex : -1;
    }
}
