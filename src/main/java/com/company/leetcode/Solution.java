package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums1 = null;
    public List<List<Integer>> permute(int[] nums) {
        this.nums1 = nums;
        permuteHelper(0);

        return res;
    }

    public void permuteHelper(int start) {
        if(start == nums1.length - 1) {
            List<Integer> list = new ArrayList();
            for(int i = 0; i < nums1.length; i++) {
                list.add(nums1[i]);
            }
            res.add(list);
        }

        for(int i = start; i < nums1.length; i++) {
            int a = nums1[start];
            int b = nums1[i];
            nums1[start] = b;
            nums1[i] = a;
            int f = start + 1;
            permuteHelper(f);
            nums1[start] = b;
            nums1[i] = a;
        }
    }
}