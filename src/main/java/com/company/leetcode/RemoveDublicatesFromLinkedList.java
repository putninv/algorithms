package com.company.leetcode;

import com.company.leetcode.model.ListNode;

public class RemoveDublicatesFromLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val) {
                prev.next = current.next;
                current = current.next.next;
//                prev =
            } else {
                prev = current;
                current = current.next;
            }
        }

        return prev.next;
    }
}
