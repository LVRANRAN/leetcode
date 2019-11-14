/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = 0;
        int res = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == 1) {
                max++;
            } else {
                max = 0;
            }
            res = Math.max(res, max);
        }
        return res;
    }
}
