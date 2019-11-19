/*
 * @lc app=leetcode id=474 lang=java
 *
 * [474] Ones and Zeroes
 */

// @lc code=start
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int ones = 0, zeroes = 0;
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if(c == '0'){
                    zeroes++;
                }else {
                    ones++;
                }
            }
            for (int i = m; i >= zeroes; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroes][j-ones]+1);
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end

