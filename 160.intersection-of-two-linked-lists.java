import java.util.HashSet;

/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> res = new HashSet<>();
        while (headA != null) {
            res.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (!res.add(headB)) {
                return headB;
            } else {
                res.add(headB);
                headB = headB.next;
            }
        }
        return null;
    }
}
