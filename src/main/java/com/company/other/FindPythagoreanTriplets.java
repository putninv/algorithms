package com.company.other;

import java.util.HashSet;
import java.util.Set;

public class FindPythagoreanTriplets {
    public boolean find(int[] array) {
        Set<Integer> squares = new HashSet<>();

        for(int i : array) {
            squares.add(i*i);
        }

        for(int i : array) {
            for(int n : array) {
                if(squares.contains(i*i + n*n)) {
                    return true;
                }
            }
        }
        return false;
    }

}
