package com.company.leetcode;

import com.company.leetcode.model.ListNode;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode list) {
        ListNode prev = null;
        ListNode current = list;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
