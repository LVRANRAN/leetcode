/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) == '0') return 0;

        int prev = 0;
        int cur = 1;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') cur = 0;

            if (i < 1 || !(s.charAt(i - 1) == '1' ||
                    (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')))
                prev = 0;

            int tmp = cur;
            cur = prev + cur;
            prev = tmp;
        }
        return cur;
    }
}
// @lc code=end

