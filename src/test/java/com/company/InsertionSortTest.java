package com.company;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {
    int[] array = new int[]{4, 3, 2, 1};

    @Test
    public void testSort() {
        int[] expectedArray = new int[]{1, 2, 3, 4};
        int[] resultArray = InsertionSort.sort(array);
        assertArrayEquals(expectedArray, resultArray);
    }
}
