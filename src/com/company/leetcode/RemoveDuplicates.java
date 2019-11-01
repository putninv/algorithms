package com.company.leetcode;

public class RemoveDuplicates {
    public static int remove(int[] nums){
        int slow = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[slow]) {
                slow++;
                nums[slow]= nums[i];
            }
        }

        return slow + 1;
    }
}
