/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0 || lists == null) {
            return null;
        }
        if (len == 1) {
            return lists[0];
        }
        while (len > 1) {
            int mid = (len + 1) / 2;
            for (int i = 0; i < len/2; i++) {
                lists[i] = mergeTwoLists(lists[i], lists[i + mid]);
            }
            len = mid;
        }
        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head = new ListNode(0);
        ListNode phead = head;
        while (l1 != null & l2 != null) {
            if (l1.val<l2.val) {
                phead.next = l1;
                phead = phead.next;
                l1 = l1.next;
            } else {
                phead.next = l2;
                phead = phead.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            phead.next = l1;
        } else {
            phead.next = l2;
        }
        return head.next;
    }
}
// @lc code=end
