package com.problemsolving.arrays;

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate2().containsNearbyDuplicate(new int[]{1},2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int index = 0;index< nums.length;index++){
            if(map.get(nums[index]) == null)
                map.put(nums[index],index);
            else
                map.put(nums[index],index - map.get(nums[index]));
        }

        for(int key :map.keySet())
            if(map.get(key)<=k)
                return true;
        return false;
    }
}
