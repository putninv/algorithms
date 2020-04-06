package com.company.leetcode;

public class FibonacciNumber {
    public static int fib(int N) {
        int[] nums = new int[]{0, 1};
        int counter = 3;
        while(counter <= N) {
            int third = nums[0] + nums[1];
            nums[0] = nums[1];
            nums[1] = third;
            counter ++;
        }

        return N > 1 ? nums[1] : nums[0];
    }

}
