/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                cnt++;
            else
                product *= nums[i];
        }
        if (cnt > 1)
            return res;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = product;
            else{
                if (cnt == 1)
                    res[i] = 0;
                else 
                    res[i] = product / nums[i];
            }
        }
        return res;
    }
}
// @lc code=end
