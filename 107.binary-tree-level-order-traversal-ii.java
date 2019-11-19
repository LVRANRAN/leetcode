/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();// can't write as new List<TreeNode>, because
        if (root == null) {
            return result;
        } // List is abstract
        Queue<TreeNode> queue = new LinkedList<TreeNode>();// can't write as new Queue<TreeNode>, because Queue is
                                                           // abstract
        List<Integer> singleLevel = new ArrayList<Integer>();
        TreeNode tempNode;
        queue.add(root);
        int i = queue.size();
        while (!queue.isEmpty()) {
            if (i == 0) {
                result.addFirst(singleLevel);
                i = queue.size();
                singleLevel = new ArrayList<Integer>();
            }
            tempNode = queue.poll();
            --i;
            singleLevel.add(tempNode.val);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        result.addFirst(singleLevel);
        return result;
    }
}
