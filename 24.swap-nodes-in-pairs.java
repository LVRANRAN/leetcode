/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        res = dummy;
        while (dummy.next != null && dummy.next.next != null) {
            ListNode tmp1 = dummy.next;
            dummy.next = dummy.next.next;
            ListNode tmp2 = dummy.next.next;
            dummy.next.next = tmp1;
            tmp1.next = tmp2;
            dummy = dummy.next.next;
        }
        return res.next;
    }
}
