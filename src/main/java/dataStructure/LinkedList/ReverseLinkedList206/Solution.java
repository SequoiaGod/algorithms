package dataStructure.LinkedList.ReverseLinkedList206;

import dataStructure.LinkedList.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode result = new ListNode();
        ListNode current = new ListNode();
        current.next = head;
        while(current.next != null) {
            ListNode temporary = new ListNode();
            result.val = current.next.val;
            temporary.next = result;
            result = temporary;
            current = current.next;
        }

        return result.next;
    }
}