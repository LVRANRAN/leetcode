import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root != null) {
            searchNode(root, "", ans);
        }
        return ans;
    }

    private void searchNode(TreeNode node, String path, List<String> ans) {
        if (node.left == null && node.right == null) {
            ans.add(path + node.val);
        }
        if (node.left != null) {
            searchNode(node.left, path + node.val + "->", ans);
        }
        if (node.right != null) {
            searchNode(node.right, path + node.val + "->", ans);
        }
    }
}
