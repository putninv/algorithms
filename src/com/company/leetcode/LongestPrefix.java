package com.company.leetcode;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        String substring = "";
        int index = 0;

        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(index >= strs[j].length() || strs[j].charAt(index) != strs[0].charAt(index)) {
                    return substring;
                }
            }
            substring += strs[0].charAt(index);
            index++;
        }

        return substring;
    }
}
