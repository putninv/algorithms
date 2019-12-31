package com.company.leetcode;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minimums;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        minimums = new Stack();
    }

    public void push(int x) {
        stack.push(x);
        if(getMin() >= x || minimums.size() == 0) {
            minimums.push(x);
        } else {
            minimums.push(getMin());
        }
    }

    public void pop() {
        int a = stack.pop();
        System.out.println("pop " + a);
        minimums.pop();

    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        if(minimums.size() <= 0){
            return 0;
        }
        return minimums.get(minimums.size()-1);
    }
}
