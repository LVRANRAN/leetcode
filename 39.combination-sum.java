/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
        if (target == 0) {
            res.add(single);
            return;
        }

        for (int i = begin; i < candidates.length && target >= candidates[i]; i++) {
            single.add(candidates[i]);
            helper(candidates, target - candidates[i], new ArrayList<Integer>(single), i);
            single.remove(single.size() - 1);
        }
    }
}
