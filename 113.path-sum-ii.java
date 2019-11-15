import java.util.*;
/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> single = new ArrayList<>();
        dfs(root, sum, single);
        return res;
    }

    public void dfs(TreeNode root, int sum, List<Integer> single) {
        if (root == null)
            return;
        single.add(root.val);
        if (sum == root.val && root.left == null && root.right == null)
            res.add(new ArrayList<>(single));
        dfs(root.left, sum - root.val, single);
        dfs(root.right, sum - root.val, single);
        single.remove(single.size() - 1);
    }
}
// @lc code=end
