/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        String res = "";
        String cur = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;
            while (right < s.length() - 1 && s.charAt(right) == s.charAt(right + 1)) {
                right++;
            }
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            left++;
            right--;
            cur = s.substring(left, right + 1);
            res = res.length() > cur.length() ? res : cur;
        }
        return res;
    }
}
