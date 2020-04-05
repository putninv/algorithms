package com.company.main;

import com.company.leetcode.Solution;
import com.company.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Solution s = new Solution();
        s.permute(new int[]{1,2,3});
    }

    private static String stringifyArray(int[] arr){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < arr.length; i ++){
            builder.append(arr[i]);
            builder.append(", ");
        }
        return builder.toString();
    }

    private static String stringifyList(List<Integer> list){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < list.size(); i ++){
            builder.append(list.get(i));
            builder.append(", ");
        }
        return builder.toString();
    }

    private static List<Integer> arrayToList(int[] array){
        List list = new ArrayList<>();
        for(int i = 0; i < array.length; i ++){
            list.add(array[i]);
        }
        return list;
    }

    private static String stringifyListNode(ListNode list){
        StringBuilder builder = new StringBuilder();
        while (list != null) {
            builder.append(list.val + " ");
            list = list.next;
        }

        return builder.toString();
    }
}
