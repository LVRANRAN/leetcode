/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                find(nums, j + 1, nums.length - 1, i, j, target);
            }
        }
        return res;
    }

    public void find(int[] nums, int begin, int end, int first, int second, int target) {
        int l = begin;
        int r = end;
        while (l < r) {
            if (nums[l] + nums[r] + nums[first] + nums[second] == target) {
                List<Integer> single = new ArrayList<>();
                single.add(nums[first]);
                single.add(nums[second]);
                single.add(nums[l]);
                single.add(nums[r]);
                if(!res.contains(single))
                    res.add(single);
                while (l < r && nums[l] == nums[l + 1])
                    l++;
                while (l < r && nums[r] == nums[r - 1])
                    r--;
                l++;
                r--;
            } else if (l < r && nums[l] + nums[r] + nums[first] + nums[second] < target) {
                l++;
            } else {
                r--;
            }
        }
    }
}
