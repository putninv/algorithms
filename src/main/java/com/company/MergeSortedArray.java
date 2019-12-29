package com.company;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1 == null || nums2 == null || nums1.length == m) {
            return;
        }

        if(nums2 == null) {
            return;
        }

        int index1 = m - 1;
        int index2 = n - 1;
        int index3 = nums1.length - 1;

        while(index1 >= 0 && index2 >= 0) {


            if(nums1[index1] <= nums2[index2]) {
                nums1[index3] = nums2[index2];
                index3--;
                index2--;
            } else {
                nums1[index3] = nums1[index1];
                index3--;
                index1--;
            }
        }

        while(index1 >= 0) {
            nums1[index3] = nums1[index1];
            index3--;
            index1--;
        }

        while(index2 >= 0) {
            nums1[index3] = nums2[index2];
            index3--;
            index2--;
        }
    }
}
