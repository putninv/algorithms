package com.company.leetcode;

import java.util.Arrays;

public class ZigZagConversion {

    public static String convert(String text, int rows) {
        StringBuilder sb = new StringBuilder();

        String[] lines = new String[rows];
        Arrays.fill(lines, "");

        int row = 0;
        boolean down = true;

        for(int i = 0; i < text.length(); i++) {
            lines[row] += text.charAt(i);

            if(row == 0) {
                down = true;
            }

            if(row == (rows - 1)) {
                down = false;
            }

            if(down) {
                row ++;
            } else {
                row--;
            }
        }

        for(String s : lines) {
            System.out.print(s);
        }

        return sb.toString();
    }
}
