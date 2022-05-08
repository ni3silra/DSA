package com.problemsolving.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        System.out.println(new SummaryRanges().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }


    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        int start = nums[0];
        int startNum = start;
        int endNum = start;
        int index = 0;

        for (int num : nums) {
            if (num != start) {
                if (startNum != endNum)
                    list.add(startNum + "->" + endNum);
                else
                    list.add(String.valueOf(startNum));
                startNum = num;
                start++;
            } else {
                if (index == nums.length - 1)
                    list.add(String.valueOf(num));
                endNum = num;
            }
            start++;
            index++;
        }

        return list;
    }
}
