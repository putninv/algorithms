package com.company.leetcode;

public class MergeSort {

    public static void sort(int [] array, int n){
        if(n < 2) {
            return;
        }

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];


        for(int i = 0; i < left.length; i ++) {
            left[i] = array[i];
            System.out.println("arrayL " + left[i]);
        }

        for(int i = mid; i < array.length; i++) {
            right[i-mid] = array[i];
            System.out.println("arrayR " + array[i]);
        }

        sort(left, left.length);
        sort(right, right.length);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {

        int index = 0;
        int left = 0;
        int right = 0;

        while(left < leftArray.length && right < rightArray.length){
            if(leftArray[left] <= rightArray[right]){
                array[index] = leftArray[left];
                left++;
            } else {
                array[index] = rightArray[right];
                right++;
            }
            index++;
        }

        while(left < leftArray.length){
            array[index] = leftArray[left];
            left++;
            index++;
        }

        while(right < rightArray.length){
            array[index] = rightArray[right];
            right++;
            index++;
        }
    }
}
