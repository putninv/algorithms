package com.company;

import java.util.List;

public class ArrayPlusOne {

    public static List<Integer> plus(List<Integer> list) {
        int length = list.size();

        for(int i = length-1; i >= 0; i--) {
            int listElement = list.get(i);
            int newEl = listElement + 1;
            if(newEl == 10) {
                list.set(i, 0);
            } else {
                list.set(i, newEl);
                break;
            }
        }

        if(list.get(0) == 0) {
            list.set(0, 1);
            list.add(0);
        }

        return list;
    }
}
