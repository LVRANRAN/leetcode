/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        DepthofTree(root);
        return max;
    }

    public int DepthofTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = DepthofTree(root.left);
        int right = DepthofTree(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
