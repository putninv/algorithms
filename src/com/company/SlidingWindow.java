package com.company;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static int getLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        Set<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;

        int result = 0;

        while (right < s.length() && left < s.length()) {
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                result = Math.max(result, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return result;
    }
}
