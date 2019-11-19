/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 0 || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            int i = 0;
            while (i < k && fast !=null) {
                fast = fast.next;
                i++;
            }
            if (i == k) {
                ListNode begin = slow;
                while (slow != fast) {
                    ListNode next = slow.next;
                    slow.next = cur.next;
                    cur.next = slow;
                    slow = next;
                }
                cur = begin;
            } else {
                cur.next = slow;
            }
            slow = fast;
        }
        return dummy.next;
    }
}
// @lc code=end
