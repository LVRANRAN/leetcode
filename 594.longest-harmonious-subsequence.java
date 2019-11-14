/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */
class Solution {
    public int findLHS(int[] nums) {
        int max = Integer.MIN_VALUE;
        if (nums == null) {
            return 0;
        }
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.abs(nums[i + 1] - nums[i]) == 1) {
                max = Math.max(max, map.get(nums[i]) + map.get(nums[i + 1]));
            }
        }
        max = Math.max(max, 0);
        return max;
    }
}
