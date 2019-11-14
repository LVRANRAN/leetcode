/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            find(nums, i + 1, nums.length - 1, nums[i]);
        }
        return res;
    }

    public void find(int[] nums, int begin, int end, int target) {
        int l = begin, r = end;
        while (l < r) {
            if (nums[l] + nums[r] + target == 0) {
                List<Integer> single = new ArrayList<>();
                single.add(target);
                single.add(nums[l]);
                single.add(nums[r]);
                res.add(single);
                while (l < r && nums[l] == nums[l + 1])
                    l++;
                while (l < r && nums[r] == nums[r - 1])
                    r--;
                l++;
                r--;
            } else if (nums[l] + nums[r] + target < 0) {
                l++;
            } else {
                r--;
            }
        }
    }
}
