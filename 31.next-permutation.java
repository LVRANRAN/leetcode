/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */
class Solution {
    public void nextPermutation(int[] nums) {
  
        for (int i = nums.length - 2; i >= 0; i--){
            if (nums[i] < nums[i + 1]){
                for (int j = nums.length - 1; j > i; j--){
                    if (nums[i] < nums[j]) {
                        swap(nums, i, j);
                        reverse(nums, i + 1, nums.length - 1);
                        return;
                    }
                }
            }
        }
        reverse(nums, 0, nums.length - 1);
    }
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    private void reverse(int[] nums, int left, int right) {
        while (left < right)
            swap(nums, left++, right--);
    }
}
