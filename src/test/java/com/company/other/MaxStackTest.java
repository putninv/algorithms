package com.company.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxStackTest {
    MaxStack maxStack;
    @Before
    public void init(){
        maxStack = new MaxStack();
        maxStack.push(1);
        maxStack.push(2);
        maxStack.push(3);
        maxStack.push(2);
    }

    @Test
    public void pop() {
        assertEquals(3, maxStack.max());
        System.out.println(maxStack.pop());
        assertEquals(3, maxStack.max());
        System.out.println(maxStack.pop());
        assertEquals(2, maxStack.max());
        System.out.println(maxStack.pop());
        assertEquals(1, maxStack.max());
        System.out.println(maxStack.pop());
        assertEquals(0, maxStack.max());
    }
}