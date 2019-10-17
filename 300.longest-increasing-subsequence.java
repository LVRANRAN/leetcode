import java.util.Arrays;

/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] f = new int[nums.length];
        Arrays.fill(f, 1);
        int global = 1;
        for (int j = 1; j < nums.length; j++) {
            for (int i = 0; i < j; i++) {
                if (nums[i] < nums[j]) {
                    f[j] = Math.max(f[i] + 1, f[j]);
                }
            }
            global = Math.max(global, f[j]);
        }
        return global;
    }
}
// @lc code=end
