/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxSum = Math.max(maxSum, sum);
            sum = 0;
        }
        return (double) maxSum / k;
    }
}
