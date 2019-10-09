/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> tmp = new ArrayList<>();
        backtrack(tmp, n, k, 1);
        return res;
    }

    public void backtrack(List<Integer> tmp, int n, int k, int start) {
        if (tmp.size() == k) {
            res.add(new ArrayList(tmp)); //?
            return;
        }
        for (int i = start; i <= n; i++) {
            tmp.add(i);
            backtrack(tmp, n, k, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
// @lc code=end
