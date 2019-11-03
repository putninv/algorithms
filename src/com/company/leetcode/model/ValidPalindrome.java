package com.company.leetcode.model;

public class ValidPalindrome {

    public static boolean isValid(String string) {
        if(string == null || string.length() <= 1) {
            return true;
        }

        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            char leftChar = string.charAt(left);
            char rightChar = string.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
