/*
 * @lc app=leetcode id=312 lang=java
 *
 * [312] Burst Balloons
 */

// @lc code=start
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] iNums = new int[n + 2];
        for (int i = 0; i < n; i++) {
            iNums[i + 1] = nums[i];
        }
        iNums[0] = iNums[n + 1] = 1;
        int[][] dp = new int[n + 2][n + 2];
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n - k + 1; i++) {
                int j = i + k - 1;
                for (int x = i; x <= j; x++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][x - 1] + iNums[i - 1] * iNums[x] * iNums[j + 1] + dp[x + 1][j]);
                }
            }
        }
        return dp[1][n];
    }
}
// @lc code=end
