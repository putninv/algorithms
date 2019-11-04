package com.company.leetcode;

public class ValidPalindromeII {

    public static boolean isValid(String s){

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return checker(s, left + 1, right) || checker(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean checker(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
