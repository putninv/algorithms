package com.company.other;

public class PancakeSort {

    public static int[] flip(int[] arr, int k) {

        int left = 0;
        int right = k -1;

        while(left < right){
            int leftVal = arr[left];
            int rightVal = arr[right];

            arr[right] = arr[left];
            arr[left] = rightVal;

            left++;
            right--;
        }

        return arr;
    }

//    public static int[] sort() {
//
//    }

}
