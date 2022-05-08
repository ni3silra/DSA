package com.problemsolving.twopointer;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length -1;
        while(i<j) {
            maxArea = Math.max(Math.min(height[i], height[j]) * (j-i),maxArea);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }

}
