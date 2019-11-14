/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(maxRob(nums, 0, nums.length - 1), maxRob(nums, 1, nums.length));
    }

    public int maxRob(int[] nums, int begin, int end) {
        if (begin == end) {
            return 0;
        }
        if (end - begin == 1) {
            return nums[begin];
        }
        int[] f = new int[end - begin + 1];
        f[begin] = nums[begin];
        f[begin + 1] = Math.max(nums[begin], nums[begin + 1]);
        for (int i = 2; i < end; i++) {
            f[i] = Math.max(f[i - 1], f[i - 2] + nums[i]);
        }
        return f[end - 1];
    }
}
// @lc code=end
