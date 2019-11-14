/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] sum = new int[m];
        sum[0] = grid[0][0];
        for (int i = 1; i < m; i++) sum[i] = grid[i][0] + sum[i-1];
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                sum[i] = grid[i][j] + (i == 0 ? sum[i] : Math.min(sum[i],sum[i-1]));
            }
        }
        return sum[m - 1];
    }
}
// @lc code=end
