import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            backtrack(tmp, nums, 0, i);
        }
        return res;
    }

    public void backtrack(List<Integer> tmp, int[] nums, int start, int k) {
        if (tmp.size() == k) {
            res.add(new ArrayList(tmp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            backtrack(tmp, nums, i + 1, k);
            tmp.remove(tmp.size() - 1);
        }
    }
}
// @lc code=end
