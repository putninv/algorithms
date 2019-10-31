package com.company;

import java.util.Arrays;

public class ClosestSum {

    public static int closestSum(int[] array, int target) {
        if(array == null || array.length < 3) {
            return -1;
        }

        Arrays.sort(array);

        int sum = array[0] + array[1] + array[2];

        for(int i = 0; i < array.length; i ++){
            int left = i + 1;
            int right = array.length - 1;

            while(left < right){
                int tempSum = array[i] + array[left] + array[right];

                if(Math.abs(tempSum - target) < Math.abs(sum - target)) {
                    sum = tempSum;
                }

                if(tempSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}
