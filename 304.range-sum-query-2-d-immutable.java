/*
 * @lc app=leetcode id=304 lang=java
 *
 * [304] Range Sum Query 2D - Immutable
 */

// @lc code=start
class NumMatrix {

    public NumMatrix(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix.length > 0 ? matrix[0].length : 0;
        this.f = new int[m + 1][n + 1];

        for (int i = 1; i < m + 1; ++i) {
            int rowSum = 0;
            for (int j = 1; j < n + 1; ++j) {
                f[i][j] += rowSum + matrix[i - 1][j - 1];
                if (i > 1) {
                    f[i][j] += f[i - 1][j];
                }
                rowSum += matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return f[row2 + 1][col2 + 1] + f[row1][col1] - f[row1][col2 + 1] - f[row2 + 1][col1];
    }

    private final int[][] f;
}

/**
 * Your NumMatrix object will be instantiated and called as such: NumMatrix obj
 * = new NumMatrix(matrix); int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end
