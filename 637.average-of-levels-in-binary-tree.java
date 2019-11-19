/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> singleLevel = new LinkedList<>();
        queue.add(root);
        int i = queue.size();
        while (!queue.isEmpty()) {
            if (i == 0) {
                i = queue.size();
                double sum = 0;
                for (int s : singleLevel) {
                    sum += s;
                }
                result.add((double) sum / singleLevel.size());
                singleLevel = new LinkedList<>();
            }
            TreeNode tmpNode = queue.poll();
            i--;
            singleLevel.add(tmpNode.val);
            if (tmpNode.left != null) {
                queue.add(tmpNode.left);
            }
            if (tmpNode.right != null) {
                queue.add(tmpNode.right);
            }
        }
        double sum = 0;
        for (int s : singleLevel) {
            sum += s;
        }
        result.add((double) sum / singleLevel.size());
        return result;
    }
}
