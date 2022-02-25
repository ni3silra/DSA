package com.problemsolving.arrays;

import java.util.Arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        int prefix[] = prefix(nums);
        int suffix[] = suffix(nums);
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i<nums.length;i++){
            max = Math.max(max,prefix[i] + suffix[nums.length - i -1]);
        }
        return max;
    }

    public int[] prefix(int[] nums){
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        System.out.println(Arrays.toString(prefix));
        return prefix;
    }

    public int[] suffix(int[] nums){
        int suffix[] = new int[nums.length];
        suffix[nums.length -1] = nums[nums.length -1];
        for(int i = nums.length -2;i>=0;i--){
            suffix[i] = suffix[i+1] + nums[i];
        }
        System.out.println(Arrays.toString(suffix));
        return suffix;
    }

}
