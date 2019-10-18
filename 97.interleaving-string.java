import java.util.Arrays;

/*
 * @lc app=leetcode id=97 lang=java
 *
 * [97] Interleaving String
 */

// @lc code=start
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }

        boolean[][] f = new boolean[s2.length() + 1][s1.length() + 1];
        f[0][0] = true;

        for (int j = 1; j <= s1.length(); j++) {
            f[0][j] = f[0][j - 1] && (s1.charAt(j - 1) == s3.charAt(j - 1));
        }
        for (int i = 1; i <= s2.length(); i++) {
            f[i][0] = f[i - 1][0] && (s2.charAt(i - 1) == s3.charAt(i - 1));
        }

        for (int i = 1; i <= s2.length(); i++) {
            for (int j = 1; j <= s1.length(); j++) {
                f[i][j] = f[i - 1][j] && (s2.charAt(i - 1) == s3.charAt(i + j - 1))
                        || f[i][j - 1] && (s1.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        return f[s2.length()][s1.length()];
    }
}
// @lc code=end
