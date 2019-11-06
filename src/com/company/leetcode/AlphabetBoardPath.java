package com.company.leetcode;

/**
 * TODO: optimize first algorithm. Try to understand fast algorithm.
 */
public class AlphabetBoardPath {

    public static String alphabetBoardPath(String target) {

        char[][] chars = {{'a','b','c','d','e'},{'f','g','h','i','j'},{'k','l','m','n','o'},{'p','q','r','s','t'},{'u','v','w','x','y'},{'z'}};

        int x = 0;
        int y = 0 ;
        StringBuilder sb = new StringBuilder();
        int t = 0;
        int f = 0;
        targetLoop:
        for(int i = 0; i < target.length(); i++) {
            char currentLetter = target.charAt(i);

            for(int n = x; n < chars.length;) {
                for(int m = y; m < chars[n].length;) {
                    t = m;
                    f = n;
                    int lastIndex = chars[n].length - 1;
                    int first = 0;

                    if(currentLetter == chars[n][m]) {
                        sb.append("!");
                        x = n;
                        y = m;
                        continue targetLoop;
                    } else if (target.charAt(i) > chars[n][m] && target.charAt(i) <= chars[n][lastIndex]) {
                        sb.append("R");
                        m++;

                    } else if (target.charAt(i) < chars[n][m] && target.charAt(i) >= chars[n][first]) {
                        sb.append("L");
                        m--;
                    } else if(target.charAt(i) > chars[n][m] && target.charAt(i) > chars[n][lastIndex]) {
                        sb.append("D");
                        n++;
                        break;

                    } else if(target.charAt(i) < chars[n][m] && target.charAt(i) < chars[n][0]) {
                        sb.append("U");
                        n--;
                        break;
                    }

                }

            }

        }

        return sb.toString();

    }

    public String alphabetBoardPathFast(String target) {
        StringBuilder result = new StringBuilder();
        char last = 'a';
        for (int i = 0; i < target.length(); i++) {
            char current = target.charAt(i);
            int[] diffs = diff(last, current);
            if (last == 'z') {
                vertical(result, diffs[0]);
                horizontal(result, diffs[1]);
            } else {
                horizontal(result, diffs[1]);
                vertical(result, diffs[0]);
            }
            result.append('!');
            last = current;
        }
        return result.toString();
    }

    private void vertical(StringBuilder result, int dist) {
        if (dist > 0) {
            for (int j = 0; j < dist; j++) result.append('D');
        } else {
            for (int j = 0; j < -dist; j++) result.append('U');
        }
    }

    private void horizontal(StringBuilder result, int dist) {
        if (dist > 0) {
            for (int j = 0; j < dist; j++) result.append('R');
        } else {
            for (int j = 0; j < -dist; j++) result.append('L');
        }
    }

    private int[] diff(char a, char b) {
        int adelta = (int)(a - 'a');
        int bdelta = (int)(b - 'a');
        return new int[]{ bdelta / 5 - adelta / 5, bdelta % 5 - adelta % 5 };
    }
}
