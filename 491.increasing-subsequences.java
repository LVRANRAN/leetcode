import java.util.*;
/*
 * @lc app=leetcode id=491 lang=java
 *
 * [491] Increasing Subsequences
 */

// @lc code=start
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> single = new ArrayList<>();
        dfs(nums, 0, single, res);
        List<List<Integer>> result = new ArrayList<>(res);
        return result;
    }

    public void dfs(int[] nums, int start, List<Integer> single, Set<List<Integer>> res) {
        if (single.size() >= 2) res.add(new ArrayList<>(single));
        for (int i = start; i < nums.length; i++) {
            if (single.size() > 0 && single.get(single.size() - 1) > nums[i]) continue;
            single.add(nums[i]);
            dfs(nums, i + 1, single, res);
            single.remove(single.size() - 1);
        }
    }
}
// @lc code=end

