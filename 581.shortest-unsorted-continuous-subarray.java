/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] cur = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            cur[i] = nums[i];
        }
        Arrays.sort(cur);
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != cur[i]) {
                left = i;
                break;
            }
            if (i == nums.length - 1) {
                return 0;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != cur[i]) {
                right = i;
                break;
            }
        }
        return right - left > 0 ? right - left + 1 : nums.length;
    }
}
