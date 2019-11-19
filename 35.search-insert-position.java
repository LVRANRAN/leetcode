/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if (nums.length == 0) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            index = nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
