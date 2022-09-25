package com.problemsolving.arrays;

import java.util.Arrays;

public class MatchSticks {

//    public boolean makesquare(int[] matchsticks) {
//
//        if(matchsticks == null || matchsticks.length == 0)
//            return false;
//
//        int max = Arrays.stream(matchsticks).max().getAsInt();
//
//        return max % 4 == 0;
//
//    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int ans = 0;
        for(int i = 0 ; i < A.length ; ){
            if(A[i]>=0 && ans == A[i]){
                ans = A[i] - 1;
            }
        }
        return ans;
    }
}
