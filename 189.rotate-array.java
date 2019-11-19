/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int pre, tem;
        for (int i = 0; i < k % nums.length; i++) {
            pre = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                tem = nums[j];
                nums[j] = pre;
                pre = tem;
            }
        }
    }
}
