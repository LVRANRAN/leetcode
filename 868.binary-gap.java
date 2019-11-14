/*
 * @lc app=leetcode id=868 lang=java
 *
 * [868] Binary Gap
 */

// @lc code=start
class Solution {
    public int binaryGap(int N) {
        String bi = Integer.toBinaryString(N);
        char[] ch = bi.toCharArray();
        int last = -1, res = 0, mx = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                if (last != -1) {
                    mx = i - last;
                }
                last = i;
                res = Math.max(res, mx);
            }
        }
        return res;
    }
}
// @lc code=end
