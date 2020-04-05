package com.company.leetcode;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elements = new HashMap<Integer, Integer>();
        for(int num : nums) {
            if(elements.get(num) != null) {
                elements.put(num, elements.get(num) + 1);
            } else {
                elements.put(num, 1);
            }
        }

        Queue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for(Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            heap.add(entry);
        }

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < k; i++) {
            list.add(heap.poll().getKey());
        }

        return list;
    }
}
