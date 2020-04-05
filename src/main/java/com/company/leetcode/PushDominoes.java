package com.company.leetcode;

public class PushDominoes {

    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] dominoesArray = dominoes.toCharArray();
        int[] force = new int[n];

        for(int i =0; i < n; i++) {
            force[i] = 0;
        }

        int f = 0;

        for(int i = 0; i < n; i++) {
            if('R' == dominoesArray[i]) {
                f = n;
            } else if('L' == dominoesArray[i]) {
                f = 0;
            } else {
                f = Math.max(f-1,0);
            }
            force[i] += f;
        }


        for(int i = n-1; i >=0; i--) {
            if('L' == dominoesArray[i]){
                f = n;
            } else if('R' == dominoesArray[i]) {
                f = 0;
            } else {
                f = Math.max((f-1),0);
            }
            force[i] -= f;
        }


        for(int i = 0; i < n; i++) {
            if(force[i] == 0) {
                dominoesArray[i] = '.';
            } else if (force[i] > 0) {
                dominoesArray[i] = 'R';
            } else if(force[i] < 0){
                dominoesArray[i]='L';
            }
        }

        return new String(dominoesArray);


    }
}
