package dataStructure.LinkedList.RemoveLinkedListElements203;

import dataStructure.LinkedList.ListNode;

/**
 * Definition for singly-linked list.
 public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode current = result;
        while(current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return result.next;
    }
}
