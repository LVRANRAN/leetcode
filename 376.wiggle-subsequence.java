/*
 * @lc app=leetcode id=376 lang=java
 *
 * [376] Wiggle Subsequence
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
        int diff = 0, tmp = nums[1] - nums[0],sum = 2;
        if(tmp == 0) sum = 1;
        for (int i = 2; i < n; i++) {
            diff = nums[i] - nums[i - 1];
            if((diff > 0 && tmp <= 0) || (diff < 0 && tmp >= 0)){
                sum++;
                tmp = diff;
            }
        }
        return sum;
    }
}
// @lc code=end

