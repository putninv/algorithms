package com.company.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxStack {
//    List<Integer> stack = new ArrayList();
    List<Integer> maxes = new ArrayList();
    Stack<Integer> stack = new Stack<>();
    public MaxStack(){

    }

    public void push(int value) {
        stack.push(value);
        if(max() >= value){
            maxes.add(max());
        } else {
            maxes.add(value);
        }
    }

    public int pop() {
        if(maxes.size() > 0) {
            maxes.remove(maxes.size() - 1);
        }
        return stack.pop();
    }

    public int max() {
        if(maxes.size() > 0) {
            return maxes.get(maxes.size() - 1);
        } else {
            return 0;
        }
    }
}
