package com.company.leetcode;

import com.company.leetcode.model.ListNode;

public class AddTwoSum {

    public static ListNode sum(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode resultList = head;
        int rest = 0;

        while(l1 != null && l2 != null) {
                int result = (l1.val + l2.val + rest) % 10;
                rest = (l1.val + l2.val + rest) / 10;
                ListNode node = new ListNode(result);
                resultList.next = node;
                resultList = node;

                l1 = l1.next;
                l2 = l2.next;
        }

        while (l1 != null) {
            int result = (l1.val + rest) % 10;
            rest = (l1.val + rest) / 10;
            ListNode node = new ListNode(result);
            resultList.next = node;
            l1 = node;
        }

        while (l2 != null) {
            int result = (l2.val + rest) % 10;
            rest = (l2.val + rest) / 10;
            ListNode node = new ListNode(result);
            resultList.next = node;
            l2 = node;
        }

        if(rest > 0) {
            ListNode node = new ListNode(rest);
            resultList.next = node;
        }

       return head.next;
    }
}
