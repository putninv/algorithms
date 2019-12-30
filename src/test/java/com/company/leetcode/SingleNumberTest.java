package com.company.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

    @Test
    public void findDuplicateTest() {
        int [] array = new int[]{4,3,2,4,1,3,2};
        int result = SingleNumber.findDuplicate(array);
        assertEquals(result, 1);
    }
}