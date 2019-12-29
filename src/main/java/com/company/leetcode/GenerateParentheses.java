package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> solutions = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        recursion(n, builder, solutions);
        return solutions;
    }

    private static void recursion(int n, StringBuilder str, ArrayList<String> sol) {
        System.out.println(str);
        if(str.length() == 2 * n) {
            sol.add(str.toString());
        } else {
            int left = 0;
            int right = 0;

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(') {
                    left++;
                }

                if(str.charAt(i) == ')') {
                    right++;
                }
            }

            if(left == right){
                recursion(n, str.append( "("), sol);
            } else if(left > right) {
                if(left < n) {
                    recursion(n, str.append( "("), sol);
                }
                recursion(n, str.append( ")"), sol);
                str.deleteCharAt(str.length() - 2);
            }
        }
    }

//    public static List<String> generateParenthesis(int n) {
//        ArrayList<String> solutions = new ArrayList<String>();
//        String a = new String();
//        recursion(n, a, solutions);
//        System.out.println(1);
//        System.out.println(a);
//        return solutions;
//    }
//
//    private static void recursion(int n, String str, ArrayList<String> sol) {
//        if(str.length() == 2 * n)
//            sol.add(str);
//        else {
//            int left = 0;
//            int right = 0;
//            for(int i = 0; i < str.length(); ++i) {
//                if(str.charAt(i) == '(')
//                    left++;
//                if(str.charAt(i) == ')')
//                    right++;
//            }
//            if(left == right)
//                recursion(n, str + "(", sol);
//            else if(right < left) {
//                if(left < n)
//                    recursion(n, str + "(", sol);
//                recursion(n, str + ")", sol);
//            }
//        }
//        System.out.println(str);
//    }
}
