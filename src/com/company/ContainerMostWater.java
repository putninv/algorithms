package com.company;

public class ContainerMostWater {

    public static int calcArea(int[] height){
        int area = 0;
        if(height == null || height.length < 2) {
            return area;
        }

        int leftIndex = 0;
        int rightIndex = height.length - 1;

        while(leftIndex < rightIndex) {
            int curArea = (rightIndex - leftIndex) * Math.min(height[leftIndex], height[rightIndex]);
            area = Math.max(area, curArea);

            if(height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return area;
    }
}
