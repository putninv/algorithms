package com.company;

public class PalindromicSubstring {

    public static String getSubstring(String s){
        if(s == null || s.length() < 2){
            return s;
        }

        boolean[][] matrix = new boolean[s.length()][s.length()];

        int left = 0;
        int right = 0;

        for(int j= 1; j < s.length(); j ++){
            for(int i = 0; i < j; i++){
                boolean isInnerWordPalindrome = matrix[i][j] || j - i <= 2;

                if(s.charAt(j - 1) == s.charAt(i + 1) && isInnerWordPalindrome) {
                    matrix[i][j] = true;
                    left = i;
                    right = j;
                }
            }
        }

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                System.out.print(", " + matrix[i][j]);
            }
            System.out.println("     ");
        }

        return s.substring(left, right + 1);
    }
}
