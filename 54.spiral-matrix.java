/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        int i = 0, j = 0;
        while (i<=matrix.length/2 && j<= matrix[0].length/2) {
            if (i < matrix.length - i && j < matrix[0].length - j) {
                single(matrix, i, matrix[0].length - j - 1, matrix.length - i - 1, j);
            }
            i++;
            j++;
        }
        return res;
    }

    public void single(int[][] matrix, int u, int r, int d, int l) {
        if (l == r) {
            for (int i = u; i <= d; i++) {
                res.add(matrix[i][l]);
            }
            return;
        }
        if (u == d) {
            for (int i = l; i <= r; i++) {
                res.add(matrix[u][i]);
            }
            return;
        }
        int ll = l;
        while (ll < r) {
            res.add(matrix[u][ll]);
            ll++;
        }
        int uu = u;
        while (uu < d) {
            res.add(matrix[uu][r]);
            uu++;
        }
        int rr = r;
        while (rr > l) {
            res.add(matrix[d][rr]);
            rr--;
        }
        int dd = d;
        while (dd > u) {
            res.add(matrix[dd][l]);
            dd--;
        }
    }
}
// @lc code=end
