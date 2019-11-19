/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return getSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int getSum(TreeNode root, int sum) {
        int result = 0;
        if (root == null) {
            return result;
        }
        if (root.val == sum) {
            result ++;
        }
        result += getSum(root.left, sum-root.val) + getSum(root.right,sum-root.val);
        return result;
    }
}
