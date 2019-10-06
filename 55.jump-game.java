/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0, i = 0;
        for (i = 0; i <= max && i < nums.length; i++) {
            max = Math.max(max, nums[i] + i);
        }
        return i == nums.length;
    }
}
// @lc code=end
