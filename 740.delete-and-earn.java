/*
 * @lc app=leetcode id=740 lang=java
 *
 * [740] Delete and Earn
 */

// @lc code=start
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[100001];
        int take = 0, skip = 0;
        for (int n : nums) {
            sum[n] += n;
        }
        for (int j = 0; j < 100001; j++) {
            int takei = skip + sum[j];
            int skipi = Math.max(take, skip);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }
}
// @lc code=end
