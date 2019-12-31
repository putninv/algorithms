package com.company.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {

    @Test
    public void testStack() {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }

    @Test
    public void test2Stack() {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(0);
        stack.push(3);
        stack.push(0);

        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(2, stack.getMin());
    }
}