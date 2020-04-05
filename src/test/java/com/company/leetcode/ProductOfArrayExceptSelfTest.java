package com.company.leetcode;

import org.junit.Test;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void productExceptSelf() {
        int[] expected = new int[]{1,2,3,4};
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        product.productExceptSelf(new int[]{1,2,3,4});
    }
}