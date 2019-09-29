/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        nodeValue(root, map);
        for (int key : map.keySet()) {
            if (k - key == key) {
                if (map.get(key) == 2) {
                    return true;
                } else {
                    return false;
                }
            }
            if (map.containsKey(k - key)) {
                return true;
            }
        }
        return false;
    }

    public void nodeValue(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        nodeValue(root.left, map);
        nodeValue(root.right, map);
    }
}
