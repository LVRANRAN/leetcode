/*
 * @lc app=leetcode id=375 lang=java
 *
 * [375] Guess Number Higher or Lower II
 */

// @lc code=start
class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+1][n+1];
        return solve(dp, 1, n);
    }
    public int solve(int[][] dp, int l, int r) {
        if(l >= r) return 0;
        if(dp[l][r] != 0) return dp[l][r];
        dp[l][r] = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            dp[l][r] = Math.min(dp[l][r], i + Math.max(solve(dp, l, i - 1), solve(dp, i + 1, r)));
        }
        return dp[l][r];
    }
}
// @lc code=end

