/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        res = dummy;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        for (int i = 0; i < len - n; i++) {
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next == null ? null : dummy.next.next;
        return res.next;
    }
}
