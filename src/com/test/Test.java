package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public boolean isDuplicateAvailable(int[] inputArray) {
        return isCheckRequired(inputArray) && checkDuplicate(inputArray);
    }

    private boolean checkDuplicate(int[] inputArray) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(inputArray).anyMatch(i -> !set.add(i));
    }

    public boolean isCheckRequired(int[] inputArray) {
        return inputArray != null && inputArray.length >=2;
    }

//    public static void main(String[] args) {
//        short s = 5 ;
//        System.out.println(add(s,6));
//     //   System.out.println(new Test().isDuplicateAvailable(new int[]{1,2,1}));
//    }

}









