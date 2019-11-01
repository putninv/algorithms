package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public int longestNonRepeatSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        Set<Character> chars = new HashSet<>();
        int left = 0;
        int right = 0;
        int sum = 0;

        while(left < s.length() && right < s.length()) {
            if(!chars.contains(s.charAt(right))) {
                chars.add(s.charAt(right));
                right++;
                sum = Math.max(sum, right - left);
            } else {
                chars.remove(s.charAt(left));
                left++;
            }
        }

        return sum;

    }


}
