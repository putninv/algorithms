package com.company.leetcode;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] resp = new int[nums.length];

        for(int i =0; i < resp.length; i++){
            resp[i] = 1;
        }

        for(int i =1; i < nums.length; i++){
            resp[i] = resp[i -1] * nums[i-1];
        }
        int right = 1;

        for(int i = nums.length-2; i >= 0; i--){
            right *= nums[i+1];
            resp[i] *= right;
        }
        return resp;

    }
}
