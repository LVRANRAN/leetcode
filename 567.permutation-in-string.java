import java.util.Arrays;

/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if(n2 < n1) return false;
        int[] h1 = new int[26];
        int[] h2 = new int[26];
        for (int i = 0; i < n1; i++) {
            h1[s1.charAt(i) - 'a']++;
            h2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(h1, h2))
            return true;
        for (int i = n1; i < n2; i++) {
            h2[s2.charAt(i) - 'a']++;
            h2[s2.charAt(i - n1) - 'a']--;
            if (Arrays.equals(h1, h2))
                return true;
        }
        return false;
    }
}
// @lc code=end
