package com.company.leetcode;

public class PalindromeNumber {

    public static boolean isPalindrome(int a) {
        char[] chars = String.valueOf(a).toCharArray();

        if(chars[0] == '-'){
            return false;
        }

        if(chars.length == 1){
            return true;
        }

        int left = 0;
        int right = chars.length - 1;
        while(left < right) {
            if(chars[left] != chars[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
