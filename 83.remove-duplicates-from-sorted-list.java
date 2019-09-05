/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur!=null && cur.next!=null) {
            if (cur.next.val == cur.val) {
                cur.next = cur.next.next;
                //cur = cur.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}

