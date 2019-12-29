package com.company.leetcode;

import com.company.leetcode.model.TreeNode;

public class ConvertSortedArrayToBST {
    static int[] nums;

    public static TreeNode sortedArrayToBST(int[] nums) {
        ConvertSortedArrayToBST.nums = nums;
        return create(0, nums.length - 1);
    }

    private static TreeNode create(int left, int right) {
        if(left > right) {
            return null;
        }

        int medium = (left + right) / 2;
        TreeNode root = new TreeNode(nums[medium]);

        root.left = create(left, medium - 1);
        root.right = create(medium + 1, right);

        return root;
    }
}
