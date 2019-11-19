/*
 * @lc app=leetcode id=552 lang=java
 *
 * [552] Student Attendance Record II
 */

// @lc code=start
class Solution {
    public int checkRecord(int n) {
        final int M = 1000000007;
        int[] P = new int[n];
        int[] L = new int[n];
        int[] A = new int[n];
        P[0] = L[0] = A[0] = 1;
        if (n > 1) {
            L[1] = 3;
            A[1] = 2;
        }
        if (n > 2)
            A[2] = 4;
        for (int i = 1; i < n; i++) {
            P[i] = ((P[i - 1] + L[i - 1]) % M + A[i - 1]) % M;
            if (i > 1)
                L[i] = ((A[i - 1] + P[i - 1]) % M + (A[i - 2] + P[i - 2]) % M) % M;
            if (i > 2)
                A[i] = ((A[i - 1] + A[i - 2]) % M + A[i - 3]) % M;
        }
        return ((A[n - 1] + P[n - 1]) % M + L[n - 1]) % M;
    }
}
// @lc code=end
