import java.util.Stack;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        if (head == null) {
            return true;
        }
        Stack<Integer> s = new Stack<>();
        while (cur != null) {
            s.push(cur.val);
            cur = cur.next;
        }
        while (head != null) {
            int t = s.pop();
            if (head.val != t) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
