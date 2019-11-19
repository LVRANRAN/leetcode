/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int[][] result = new int[m][n];
        int[] range = new int[] { -1, 0, 1 };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                int current = 0;
                for (int a : range) {
                    for (int b : range) {
                        if (i + a < m && i + a >= 0 && j + b < n && j + b >= 0) {
                            current += M[i + a][j + b];
                            count++;
                        }
                    }
                }
                result[i][j] = (int) Math.floor((double) current / count);
            }
        }
        return result;
    }
}
