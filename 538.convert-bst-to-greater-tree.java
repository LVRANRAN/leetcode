/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        TreeNode dummy = root;
        Stack<TreeNode> stack = new Stack<>();
        Integer prev = null;
        int sum = 0;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.add(root);
                root = root.right;
            } else {
                TreeNode node = stack.pop();
                if (prev != null) {
                    node.val += prev;
                }
                prev = node.val;
                root = node.left;
            }
        }
        return dummy;
    }
}
