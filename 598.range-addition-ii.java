/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 */
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m * n;
        }
        int row = Integer.MAX_VALUE;
        int column = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            row = Math.min(row, ops[i][0]);
            column = Math.min(column, ops[i][1]);
        }
        return row * column;
    }
}
