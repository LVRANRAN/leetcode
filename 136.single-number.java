/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */
class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        for (int n : nums) {
            i ^= n;
        }
        return i;
    }
}
