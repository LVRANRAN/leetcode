/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] A) {
        int m = A.length, n = A.length > 0 ? A[0].length : 0;
        int[][] transA = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transA[j][i] = A[i][j];
            }
        }
        return transA;
    }
}
// @lc code=end
