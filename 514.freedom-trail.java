/*
 * @lc app=leetcode id=514 lang=java
 *
 * [514] Freedom Trail
 */

// @lc code=start
class Solution {
    public int findRotateSteps(String ring, String key) {
        int m = ring.length();
        int n = key.length();
        int[][] dp = new int[n + 1][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) {
                    if (key.charAt(i) == ring.charAt(k)) {
                        int diff = Math.abs(j - k);
                        int step = Math.min(diff, m - diff);
                        dp[i][j] = Math.min(dp[i][j], step + dp[i + 1][k]);
                    }
                }
            }
        }
        return dp[0][0] + n;
    }
}
// @lc code=end
