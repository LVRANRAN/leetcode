/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0)
            return 0;
        int left = 0, right = 0, sum = 0, m = nums.length, res = m + 1;
        while (right < m) {
            while (sum < s && right < m) {
                sum += nums[right++];
            }
            while (sum >= s) {
                res = Math.min(res, right - left);
                sum -= nums[left++];
            }
        }
        return res == m + 1 ? 0 : res;
    }
}
// @lc code=end
