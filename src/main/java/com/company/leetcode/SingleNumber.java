package com.company.leetcode;

public class SingleNumber {
    public static int findDuplicate(int[] nums) {
        int result = 0;

        for(int n : nums) {
            result ^= n;
        }
        return result;
    }
}
