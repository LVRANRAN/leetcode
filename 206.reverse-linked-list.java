/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode preHead = head;
        ListNode curNode = null;
        for (int i = 0; head != null; i++) {
            preHead = head.next;
            head.next = curNode;
            curNode = head;
            head = preHead;
        }
        return curNode;
    }
}
