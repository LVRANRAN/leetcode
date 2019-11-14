/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        if (nums == null || nums.length == 0) {
            return res;
        }
        int ll = 0;
        int lr = nums.length - 1;
        while (ll <= lr) {
            int mid = ll + (lr - ll) / 2;
            if (nums[mid] < target) {
                ll = mid + 1;
            } else {
                lr = mid - 1;
            }
        }
        int rl = 0;
        int rr = nums.length - 1;
        while (rl <= rr) {
            int mid = rl + (rr - rl) / 2;
            if (nums[mid] > target) {
                rr = mid - 1;
            } else {
                rl = mid + 1;
            }
        }
        if (ll > rr) {
            return res;
        }
        res[0] = ll;
        res[1] = rr;
        return res;
    }
}
