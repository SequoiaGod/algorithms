package dataStructure.LinkedList.SwapNodesinPairs24;

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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode result = new ListNode();
        ListNode prevNode = result;
        ListNode current = head;

        while(current != null && current.next != null) {
            prevNode.next = current.next;
            current.next = prevNode.next.next;
            prevNode.next.next = current;

            prevNode = current;
            current = prevNode.next;
        }

        return result.next;
    }
}