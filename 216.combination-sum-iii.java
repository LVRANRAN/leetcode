import java.util.*;

/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        helper(k, n, 1, out, res);
        return res;
    }

    public void helper(int k, int n, int level, List<Integer> out, List<List<Integer>> res) {
        if (n < 0)
            return;
        if (out.size() == k && n == 0)
            res.add(new ArrayList<>(out));
        for (int i = level; i <= 9; i++) {
            out.add(i);
            helper(k, n - i, i + 1, out, res);
            out.remove(out.size() - 1);
        }
    }
}
// @lc code=end
