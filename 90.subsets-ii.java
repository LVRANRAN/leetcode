import java.util.*;
/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) return res;
        List<Integer> nu = new ArrayList<>();
        Arrays.sort(nums);
        res.add(nu);
        int size = 1, last = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (last != nums[i]) {
                last = nums[i];
                size = res.size();
            }
            int newSize = res.size();
            for (int j = newSize - size; j < newSize; j++) {
                res.add(new ArrayList<>(res.get(j)));
                res.get(res.size() - 1).add(nums[i]);
            }
        }
        return res;
    }
}
// @lc code=end
