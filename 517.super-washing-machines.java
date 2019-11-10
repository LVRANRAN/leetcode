/*
 * @lc app=leetcode id=517 lang=java
 *
 * [517] Super Washing Machines
 */

// @lc code=start
class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        for (int m : machines) {
            sum += m;
        }
        if (sum % machines.length != 0)
            return -1;
        int res = 0, cnt = 0, avg = sum / machines.length;
        for (int m : machines) {
            cnt += m - avg;
            res = Math.max(res, Math.max(Math.abs(cnt), m - avg));
        }
        return res;
    }
}
// @lc code=end
