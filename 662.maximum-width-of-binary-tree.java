import java.util.*;
/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
 */

import javax.swing.tree.TreeNode;

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        Queue<AnnotatedNode> queue = new LinkedList<>();
        queue.add(new AnnotatedNode(root, 0, 0));
        int curDepth = 0, left = 0, ans = 0;
        while (!queue.isEmpty()) {
            AnnotatedNode tmp = queue.poll();
            if (tmp.node != null) {
                queue.add(new AnnotatedNode(tmp.node.left, tmp.depth + 1, tmp.pos * 2));
                queue.add(new AnnotatedNode(tmp.node.right, tmp.depth + 1, tmp.pos * 2 + 1));
                if (curDepth != tmp.depth) {
                    curDepth = tmp.depth;
                    left = tmp.pos;
                }
                ans = Math.max(ans, tmp.pos - left + 1);
            }
        }
        return ans;
    }

    class AnnotatedNode {
        TreeNode node;
        int depth, pos;

        AnnotatedNode(TreeNode n, int d, int p) {
            node = n;
            depth = d;
            pos = p;
        }
    }
}
// @lc code=end
