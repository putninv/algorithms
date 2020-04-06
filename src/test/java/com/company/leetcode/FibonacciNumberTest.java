package com.company.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberTest {

    @Test
    public void fib() {
        assertEquals(1, FibonacciNumber.fib(3));
        assertEquals(3, FibonacciNumber.fib(5));
        assertEquals(34, FibonacciNumber.fib(10));
    }
}