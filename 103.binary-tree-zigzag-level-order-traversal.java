import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int cnt = 0;
        List<Integer> singleLevel;
        while (!queue.isEmpty()) {
            singleLevel = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode tmp = queue.peek();
                queue.poll();
                singleLevel.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            if (cnt % 2 == 1) {
                Collections.reverse(singleLevel);
            }
            cnt++;
            res.add(singleLevel);
        }
        return res;
    }
}
// @lc code=end
