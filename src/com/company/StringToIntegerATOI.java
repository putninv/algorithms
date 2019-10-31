package com.company;

public class StringToIntegerATOI {

    public static int convert(String s) {
        if(s == null){
            return 0;
        }

        s = s.trim();
        if(s.length() == 0) {
            return 0;
        }

        boolean isNegative = false;
        int result = 0;
        int startIndex = 0;

        if(s.charAt(0) == '-') {
            startIndex++;
            isNegative = true;
        }

        if(s.charAt(0) == '+') {
            startIndex++;
        }

        for(int i = startIndex; i < s.length(); i++) {

            if(s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }

            int value = (int)(s.charAt(i) - '0');
            result = result * 10 + value;
        }

        if(result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        if(result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        return isNegative ? -result : result;
    }

}
