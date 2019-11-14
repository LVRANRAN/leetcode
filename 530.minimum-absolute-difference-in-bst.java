/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int res = Integer.MAX_VALUE;
        Integer prev = null;
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                if (prev != null) {
                    res = Math.min(res, node.val - prev);
                }
                prev = node.val;
                root = node.right;
            }
        }
        return res;
    }
}
