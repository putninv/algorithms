package com.company.leetcode;

import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < chars.length; i++){
            if((chars[i] == '}' || chars[i] == ']'
                    || chars[i] == ')') && !stack.isEmpty()){
                boolean answer = doCheck(stack.pop(), chars[i]);

                if(!answer){
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        System.out.println("finish ");
        return stack.isEmpty();
    }

    private static boolean doCheck(char left, char right) {
        System.out.println(left +" "+ right);

        if(left == '(' && right == ')'
                || left == '[' && right == ']'
                || left == '{' && right == '}'){
            return true;
        } else {
            return false;
        }
    }
}
