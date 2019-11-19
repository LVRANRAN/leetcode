import java.util.HashMap;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */
class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;
        for (int n : nums) {
            if (count == 0) {
                majority = n;
            }
            if (majority == n) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
