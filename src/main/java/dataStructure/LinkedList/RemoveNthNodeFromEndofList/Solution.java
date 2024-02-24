package dataStructure.LinkedList.RemoveNthNodeFromEndofList;

import dataStructure.LinkedList.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        int index = 0;
        ListNode result = new ListNode();
        result.next = head;
        ListNode current = result;
        ListNode slowNode = result;

        while(current.next != null) {

            if(index < n ) {
                index++;
            } else {
                slowNode = slowNode.next;
            }
            current = current.next;
        }

        if(index == n) slowNode.next = slowNode.next.next;
        return result.next;
    }
}
