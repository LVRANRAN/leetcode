/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public String tree2str(TreeNode t) {
        String result = preOrder(t);
        return result;
    }

    public String preOrder(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return t.val + "";
        }
        if (t.right == null) {
            return t.val + "(" + preOrder(t.left) + ")";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t.val);
        String s = preOrder(t.left);
        sb.append("(" + s + ")");
        String s2 = preOrder(t.right);
        sb.append("(" + s2 + ")");
        return sb.toString();
    }
}
