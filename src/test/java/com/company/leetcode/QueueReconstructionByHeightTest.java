package com.company.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QueueReconstructionByHeightTest {
    int[][] queue = new int[][]{{7,0}, {4,4}, {7,1}, {5,2}, {6,1}, {5,0}};

    @Test
    public void reconstructQueue() {
        int[][] expected = new int[][]{{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
        int [][] result = QueueReconstructionByHeight.reconstructQueue(queue);
        assertArrayEquals(expected, result);
    }
}