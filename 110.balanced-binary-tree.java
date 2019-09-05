/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(depth(root.left)-depth(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
