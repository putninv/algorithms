package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static int[][] generateMatrix(int n) {
        boolean up = false;
        boolean down = false;
        boolean right = true;
        boolean left = false;

        int finalValue = (int) Math.sqrt(n);
        int currentValue = 0;

        int[][] resultMatrix = new int[n][n];

        for(int i = 0; i < resultMatrix.length; i++){
            for(int m = 0; m < resultMatrix[i].length; m++){
                System.out.println(resultMatrix[i][m]);
            }
        }


        while(currentValue <= finalValue){
            
        }
        return resultMatrix;
    }

    public List < Integer > spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
}
