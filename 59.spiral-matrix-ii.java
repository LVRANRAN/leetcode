/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    int count = 0;
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n==0) {
            return res;
        }
        int i = 0, j = 0;
        int begin = 1, end = n*n;
        while (i<=n/2 && j<= n/2) {
            if (i < n - i && j < n - j) {
                single(res, i, n - j - 1, n - i - 1, j, begin + count, end);
            }
            i++;
            j++;
        }
        return res;
    }

    public void single(int[][] res, int u, int r, int d, int l, int begin, int end) {
        int ll = l;
        while (ll < r) {
            res[u][ll] = begin++;
            ll++;
            count++;
        }
        int uu = u;
        while (uu < d) {
            res[uu][r] = begin++;
            uu++;
            count++;
        }
        int rr = r;
        while (rr > l) {
            res[d][rr] = begin++;
            rr--;
            count++;
        }
        int dd = d;
        while (dd > u) {
            res[dd][l] = begin++;
            dd--;
            count++;
        }
        if (l == r) {
            for (int i = d; i >= u; i--) {
                res[i][l] = end--;
                count++;
            }
            return;
        }
        if (u == d) {
            for (int i = r; i >= l; i--) {
                res[u][i] = end--;
                count++;
            }
            return;
        }
    }
}
// @lc code=end

