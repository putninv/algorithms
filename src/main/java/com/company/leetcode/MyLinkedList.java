package com.company.leetcode;

import com.company.leetcode.model.ListNode;

public class MyLinkedList {
    int length;
    ListNode head = null;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        length = 0;
        head = new ListNode(0);

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= length) return -1;

        ListNode current = head;
        for(int i =0; i < index +1; i++) {
            current = current.next;
        }
        return current.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        this.addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        this.addAtIndex(length, val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0) {
            index = 0;
        }

        if(index > length){
            return;
        }

        length++;
        ListNode current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }

        ListNode node = new ListNode(val);
        node.next = current.next;
        current.next = node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
//         if(index < 0 || index >= length) {
//             return;
//         }

//         length--;
//         ListNode damn = new ListNode(0);
//         damn.next = head;
//         ListNode current = head;
//         ListNode prev = damn;
//         for(int i = 0; i < index; i++) {
//             prev = current;
//             current = current.next;
//         }

//         prev.next = prev.next.next;


        // if the index is invalid, do nothing
        if (index < 0 || index >= length) return;

        length--;
        // find predecessor of the node to be deleted
        ListNode pred = head;
        for(int i = 0; i < index; ++i) pred = pred.next;

        // delete pred.next
        pred.next = pred.next.next;
    }
}