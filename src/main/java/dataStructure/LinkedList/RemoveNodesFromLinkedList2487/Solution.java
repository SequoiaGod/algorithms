package dataStructure.LinkedList.RemoveNodesFromLinkedList2487;

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
    // public ListNode removeNodes(ListNode head) {
    //     ListNode result = new ListNode();
    //     result.next = head;
    //     ListNode fastPointer = head;
    //     ListNode slowPointer = result;

    //     while (fastPointer.next != null) {
    //         if(fastPointer.val > slowPointer.next.val) {
    //             slowPointer.next = fastPointer;
    //         }
    //         fastPointer = fastPointer.next;


    //         if(fastPointer.next == null && slowPointer.next != null) {
    //             slowPointer = slowPointer.next;
    //             fastPointer = slowPointer.next;
    //         }
    //     }

    //     return result.next;
    // }


    public ListNode removeNodes(ListNode head) {
        if (head == null) return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }
}