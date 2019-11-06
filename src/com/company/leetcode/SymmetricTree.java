package com.company.leetcode;


import com.company.leetcode.model.ListNode;
import com.company.leetcode.model.TreeNode;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        return isSymetric(root.left, root.right);


    }

    public static boolean isSymetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        }

        if(left.val != right.val) {
            return false;
        }

        return isSymetric(left.left, right.right) && isSymetric(left.right, right.left);
    }


}
