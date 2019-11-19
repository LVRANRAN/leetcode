import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> singleLevel;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            singleLevel = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode tmpNode = queue.peek();
                queue.poll();
                singleLevel.add(tmpNode.val);
                if (tmpNode.right != null) {
                    queue.add(tmpNode.right);
                }
                if (tmpNode.left != null) {
                    queue.add(tmpNode.left);
                }
            }
            res.add(singleLevel.get(0));
        }
        return res;
    }
}
// @lc code=end
