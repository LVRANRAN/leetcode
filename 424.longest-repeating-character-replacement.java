/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, maxCnt = 0, start = 0;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            maxCnt = Math.max(maxCnt, ++counts[s.charAt(i) - 'A']);
            while (i - start + 1 - maxCnt > k) {
                --counts[s.charAt(start) - 'A'];
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
// @lc code=end
