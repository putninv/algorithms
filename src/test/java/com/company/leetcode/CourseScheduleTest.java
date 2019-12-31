package com.company.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CourseScheduleTest {

    @Test
    public void testCanFinish() {
        CourseSchedule schedule = new CourseSchedule();
        int[][] matrix = new int[][]{{1,0}};
        int[][] matrix1 = new int[][]{{1,0},{0,1}};
        int[][] matrix2 = new int[][]{{2,0},{1,0},{3,1},{3,2},{1,3}};
        int[][] matrix3 = new int[][]{{1,0}};

        boolean result = schedule.canFinish(2, matrix);
        boolean result1 = schedule.canFinish(2, matrix1);
        boolean result2 = schedule.canFinish(4, matrix2);
        boolean result3 = schedule.canFinish(3, matrix3);

        assertTrue(result);
        assertFalse(result1);
        assertFalse(result2);
        assertTrue(result3);
    }
}