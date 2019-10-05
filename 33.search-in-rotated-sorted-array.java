/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */
class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        } else if (target < nums[nums.length - 1]) {
            for (int i = nums.length - 2; i >= 0; i--) {
                if (target == nums[i]) {
                    return i;
                }
                if (target > nums[i]) {
                    return -1;
                }
            }
        } else if (target > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (target == nums[i]) {
                    return i;
                }
                if (target < nums[i]) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
