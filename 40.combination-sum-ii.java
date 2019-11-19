/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length < 1) {
            return res;
        }
        Arrays.sort(candidates);
        helper(candidates, target, new ArrayList<Integer>(), 0);
        return res;
    }

    public void helper(int[] candidates, int target, ArrayList<Integer> single, int begin) {
        if (target < 0) {
            return;
        }
        if (target == 0 && !res.contains(single)) {
            res.add(single);
            return;
        }

        for (int i = begin; i < candidates.length && target >= candidates[i]; i++) {
            single.add(candidates[i]);
            helper(candidates, target - candidates[i], new ArrayList<Integer>(single), i + 1);
            single.remove(single.size() - 1);
        }
    }
}
// @lc code=end

