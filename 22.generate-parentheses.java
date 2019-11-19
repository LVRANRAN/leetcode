/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */
class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }
        helper(n, n, "");
        return res;
    }

    public void helper(int l, int r, String tmp) {
        if (l == 0 && r == 0) {
            res.add(tmp);
            return;
        }
        if (l > 0) {
            helper(l - 1, r, tmp + "(");
        }
        if (r > l) {
            helper(l, r - 1, tmp + ")");
        }
    }
}
