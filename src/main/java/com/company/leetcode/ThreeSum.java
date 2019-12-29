package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> sum(int[] nums){
        List<List<Integer>> results = new ArrayList<>();

        if(nums == null || nums.length < 3) {
            return results;
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i ++){

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            calcResult(nums, results, target, left, right);
        }

        return results;
    }

    private static void calcResult(int[] nums, List<List<Integer>> results, int target, int left, int right) {
        while(left < right) {
            System.out.println(left + " " + right);
            if(nums[left] + nums[right] == target) {
                List<Integer> result = new ArrayList<>();
                result.add(-target);
                result.add(nums[left]);
                result.add(nums[right]);

                results.add(result);

                left++;
                right--;


                while(left < right && nums[left] == nums[left - 1]) {
                    left++;
                }

                while(left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if(nums[left] + nums[right] > target) {
                right--;
            } else if(nums[left] + nums[right] < target) {
                left++;
            }
        }
    }
}
