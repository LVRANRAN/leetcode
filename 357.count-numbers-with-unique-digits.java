/*
 * @lc app=leetcode id=357 lang=java
 *
 * [357] Count Numbers with Unique Digits
 */

// @lc code=start
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        int res = 10, cnt = 9;
        for (int i = 2; i <= n; i++) {
            cnt *= 11 - i;
            res += cnt;
        }
        return res;
    }
}
// @lc code=end
