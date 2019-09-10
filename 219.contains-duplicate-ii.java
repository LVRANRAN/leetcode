/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(nums[i])) {
                if (Math.abs(table.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            table.put(nums[i], i);
        }
        return false;
    }
}
