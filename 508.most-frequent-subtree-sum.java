import java.util.*;
/*
 * @lc app=leetcode id=508 lang=java
 *
 * [508] Most Frequent Subtree Sum
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public static HashMap<Integer, Integer> map;
    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        helper(root);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {   
            if(entry.getValue()>max){
                arr = new ArrayList<>();
                arr.add(entry.getKey());
                max = entry.getValue();
            }
            else if(entry.getValue()==max){
                arr.add(entry.getKey());
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();++i){
            ans[i] = arr.get(i);
        }
        return ans;
    }
    

    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        helper(root.right);
        root.val += ( root.left != null ? root.left.val : 0) +
                    ( root.right != null ? root.right.val : 0);
        
        map.put(root.val, map.getOrDefault(root.val,0)+1);
        return;
    }
}
// @lc code=end
