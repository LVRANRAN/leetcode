/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] - nums[i] == k) {
                    res++;
                    break;
                }
            while (i < nums.length - 1 && nums[i] == nums[i + 1])
                i++;
        }
        return res;
    }
}
