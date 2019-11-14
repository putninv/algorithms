package com.company.leetcode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int slow = 0;
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] wordChars = strs[slow].toCharArray();
            Arrays.sort(wordChars);
            String word = new String(wordChars);

            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<>());
            }

            map.get(word).add(strs[i]);

            result.addAll(map.values());
        }

        return result;
    }
}
