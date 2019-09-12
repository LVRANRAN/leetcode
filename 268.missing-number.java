/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        int flag = 1;
        for (int n : nums) {
            set.add(n);
            if (n == 0) {
                flag = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.add(i)) {
                return i;
            }
        }
        if (flag == 0) {
            return nums.length;
        }
        return res;
    }
}
