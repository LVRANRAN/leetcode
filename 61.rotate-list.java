/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode a = new ListNode(0);
        a = head;
        while (a != null) {
            count++;
            a = a.next;
        }
        k = k % count;
        while (k > 0) {
            ListNode cur, pre;
            pre = cur = dummy.next;
            while (pre.next.next != null) {
                pre = pre.next;
            }
            while (cur.next != null) {
                cur = cur.next;
            }
            pre.next = null;
            cur.next = dummy.next;
            dummy.next = cur;
            k--;
        }
        return dummy.next;
    }
}
// @lc code=end
