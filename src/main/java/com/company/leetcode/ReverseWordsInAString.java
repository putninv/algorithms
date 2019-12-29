package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {

    /**
     * O(2n) complexity.
     */
    public static String reverse(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        for(int i = words.length - 1; i >= 0; i--) {
            if(i > 0){
                builder.append(words[i] + " ");
            } else {
                builder.append(words[i]);
            }

        }

        return builder.toString();
    }

    /**
     * O(n) complexity.
     */
    public static String reverseFast(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >=0; i--) {
            String w = words[i];
            if (w.equals("")) {
                continue;
            }
            sb.append(w);
            sb.append(" ");
        }

        if (sb.length() == 0) {
            return sb.toString();
        }

        return sb.substring(0, sb.length() -1).toString();
    }

    /**
     * O(n) complexity.
     */
    public static String reverse2(String s) {
        if(s == null) {
            return s;
        }
        s = s.trim();

        if(s.length() <= 1){
            return s;
        }

        List<String> words = new ArrayList<>();

        StringBuilder builder = new StringBuilder("");
        int lastIndex = s.length() - 1;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(Character.isWhitespace(s.charAt(i)) && Character.isWhitespace(s.charAt(i + 1))){
                lastIndex = i;
                continue;
            }

            if(i == 0 && !Character.isWhitespace(s.charAt(lastIndex))){
                words.add(s.substring(i, lastIndex + 1));
            } else

            if(i == 0) {
                words.add(s.substring(i, lastIndex));
            } else if(Character.isWhitespace(s.charAt(i)) && lastIndex == s.length() - 1) {
                words.add(s.substring(i + 1, lastIndex+1));
                lastIndex = i;
            } else if(Character.isWhitespace(s.charAt(i))) {
                words.add(s.substring(i + 1, lastIndex));
                lastIndex = i;
            }

        }


        for(int i = 0; i < words.size(); i++) {

            if(i == words.size() - 1) {
                builder.append(words.get(i));
            } else {
                builder.append(words.get(i) + " ");
            }

        }


        return builder.toString();
    }


}
