package com.problemsolving.arrays;

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;

        for (int i = 0; i < nums.length; i += 2)
            ans += Math.min(nums[i], nums[i + 1]);

        return ans;
    }
}
