import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=368 lang=java
 *
 * [368] Largest Divisible Subset
 */

// @lc code=start
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        if (n == 0)
            return res;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] index = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(index, -1);
        int maxIndex = 0, maxDp = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    index[i] = j;
                }
            }
            if (maxDp < dp[i]) {
                maxDp = dp[i];
                maxIndex = i;
            }
        }
        for (int i = maxIndex; i >= 0; i = index[i]) {
            res.add(nums[i]);
        }
        return res;
    }
}
// @lc code=end
