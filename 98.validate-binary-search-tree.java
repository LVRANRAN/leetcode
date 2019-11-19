import java.util.*;
/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode root, long mn, long mx) {
        if (root == null) return true;
        if (root.val <= mn || root.val >= mx) return false;
        return valid(root.left, mn, root.val) && valid(root.right, root.val, mx);
    }
}
// @lc code=end

