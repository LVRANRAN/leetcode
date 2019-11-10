import java.util.Arrays;

/*
 * @lc app=leetcode id=673 lang=java
 *
 * [673] Number of Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int mx = 0, res = 0, n = nums.length;
        int[] len = new int[n];
        int[] cnt = new int[n];
        Arrays.fill(len, 1);
        Arrays.fill(cnt, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] <= nums[j]) continue;
                if (len[i] == len[j] + 1) {
                    cnt[i] += cnt[j];
                } else if (len[i] < len[j] + 1) {
                    len[i] = len[j] + 1;
                    cnt[i] = cnt[j];
                }
            }
            if (mx == len[i])
                res += cnt[i];
            else if (mx < len[i]) {
                mx = len[i];
                res = cnt[i];
            }
        }
        return res;
    }
}
// @lc code=end
