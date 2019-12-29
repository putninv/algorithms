package com.company.leetcode;

import java.util.Arrays;

public class QueueReconstructionByHeight {
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (int[] a, int[] b) -> {
            if(a[0] - b[0] == 0) {
                 return a[1] - b[1];
            }

            return b[0] - a[0];
        });

        int resp[][] = new int[people.length][2];

        for(int[] i : people) {
            if(resp[i[1]][0] != 0) {
                for(int m = resp.length-1; m > i[1]; m--){
                    resp[m] = resp[m-1];
                }
                resp[i[1]] = i;
            }
            resp[i[1]] = i;
        }
        return resp;
    }
}
