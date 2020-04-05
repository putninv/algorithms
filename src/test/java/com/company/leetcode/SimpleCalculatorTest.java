package com.company.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void calculate() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(11, calculator.calculate("(7)-(0)+(4)"));
    }
}