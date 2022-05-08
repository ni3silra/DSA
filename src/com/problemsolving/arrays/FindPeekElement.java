package com.problemsolving.arrays;

public class FindPeekElement {

    public int findPeakElement(int[] nums) {
        int len = nums.length;

        if (len == 1) return 0;
        else if (nums[0] > nums[1]) return 0;
        else if (nums[len - 1] > nums[len - 2]) return len - 1;

        for (int i = 1; i < len - 1; i++)
            if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1])
                return i;
        return 0;
    }

    int findPeak(int[] nums, int st, int ed) {
        if (st < ed) {
            int mid = (st + ed) / 2;
            if (nums[mid] > nums[mid + 1])
                return findPeak(nums, st, mid);
            return findPeak(nums, mid + 1, ed);
        } else {
            return st;
        }
    }
}
