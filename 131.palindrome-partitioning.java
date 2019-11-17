import java.util.*;

/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> out = new ArrayList<>();
        helper(s, 0, out, res);
        return res;
    }

    public void helper(String s, int start, List<String> out, List<List<String>> res) {
        if (start == s.length())
            res.add(new ArrayList<>(out));
        for (int i = start; i < s.length(); i++) {
            if (!isPalindrome(s, start, i))
                continue;
            out.add(s.substring(start, i + 1));
            helper(s, i + 1, out, res);
            out.remove(out.size() - 1);
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end
