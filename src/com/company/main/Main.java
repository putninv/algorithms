package com.company.main;

import com.company.leetcode.ReverseWordsInAString;
import com.company.leetcode.ZigZagConversion;
import com.company.leetcode.model.ListNode;
import com.company.leetcode.ValidPalindrome;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        int[] actual = { 2, 1, 0, 3, 4, 5, 6 };
//        int[] expected = { 1, 2, 3, 4, 5, 6 };
//
//        MergeSort.sort(actual, actual.length);

//        Parentheses.isValid("]");
//        System.out.println(SlidingWindow.getLongestSubstring("pwwkew"));
//        System.out.println(PalindromicSubstring.getSubstring("pwwkewe"));
//        System.out.println(RemoveDuplicates.remove(new int[]{1, 1, 2}));

//        System.out.println(StringToIntegerATOI.convert("  -45BGH 5"));

//        System.out.println(BinarySearch.find(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19}, 45));

//        System.out.println(ExpressionParsingAlgorithm.parse("(1+(3+4))"));

//        System.out.println(Main.stringifyList(ArrayPlusOne.plus(arrayToList(new int[]{9,9,9,9}))));

//        ThreeSum.sum(new int[]{-2,0,1,1,2});
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        System.out.println(stringifyListNode(ReverseLinkedList.reverse(node1)));
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        node1.next = node2;
//        node2.next = node3;
//        node4.next = node5;
//        node5.next = node6;
//        //123 + 456 = 579
//        System.out.println(stringifyListNode(AddTwoSum.sum(node1, node4)));

//        ClosestSum.closestSum(new int[]{1,2,3,4,8,16,32,64,128}, 82);

//                ListNode node1 = new ListNode(1);
//                ListNode node2 = new ListNode(2);
//                node1.next = node2;
//
//        System.out.println(stringifyListNode(RemoveNthElement.removeNthFromEnd(node1, 2)));

//        System.out.println(PalindromeNumber.isPalindrome(1221));


//        System.out.println(stringifyArray(PancakeSort.flip(new int[]{1,2,3,4,5,6,7,8,9}, 4)));

//        System.out.println(ValidPalindrome.isValid("race a car"));

//        System.out.println(ReverseWordsInAString.reverse("  Hello     my beautiful  world   "));

        System.out.println(ZigZagConversion.convert("PAYPALISHIRING", 3));
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
