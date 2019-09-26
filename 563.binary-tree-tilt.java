/*
 * @lc app=leetcode id=563 lang=java
 *
 * [563] Binary Tree Tilt
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int tilt = 0;

    public int findTilt(TreeNode root) {
        getNodeValue(root);
        return tilt;
    }

    public int getNodeValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getNodeValue(root.left);
        int right = getNodeValue(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
    }
}
