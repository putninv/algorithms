package com.company;

public class BinarySearch {

    public static int find(int[] array, int value) {
        if(array == null){
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex < rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if(array[midIndex] > value) {
                rightIndex = midIndex- 1;
            } else if(array[midIndex] < value) {
                leftIndex = midIndex + 1;
            } else if(array[midIndex] == value) {
                return array[midIndex];
            }
        }

        return -1;

    }
}
