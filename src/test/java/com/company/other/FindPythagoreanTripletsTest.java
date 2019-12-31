package com.company.other;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindPythagoreanTripletsTest {

    @Test
    public void find() {
        int[] array = new int[]{3,5,12,5,13};

        FindPythagoreanTriplets triplets = new FindPythagoreanTriplets();
        assertTrue(triplets.find(array));
    }
}