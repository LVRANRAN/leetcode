import java.util.Arrays;

/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int[] dummy = new int[nums.length];
        for (int i = 0; i < dummy.length; i++) {
            dummy[i] = nums[i];
        }
        Arrays.sort(dummy);
        if (dummy[nums.length - 1] < dummy[nums.length - 2] * 2)
            return -1;
        for (int i = 0; i < dummy.length; i++) {
            if (nums[i] == dummy[nums.length - 1]) {
                return i;
            }
        }
        return 0;
    }
}
// @lc code=end
