/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        ListNode newNode = null;
        int remainder = 0;
        int num1 = 0, num2 = 0, sum = 0;
        while (l1 != null || l2 != null || remainder != 0) {
            num1 = l1 == null ? 0 : l1.val;
            num2 = l2 == null ? 0 : l2.val;
            sum = num1 + num2 + remainder;
            if (sum >= 10) {
                remainder = sum / 10;
                sum = sum % 10;
            } else if (sum > 0 && sum < 10) {
                remainder = 0;
            }
            newNode = new ListNode(sum); // Attention
            dummy.next = newNode;
            dummy = dummy.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        dummy.next = null; // Attention
        return res.next;
    }
}
