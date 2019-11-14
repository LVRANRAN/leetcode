/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */
class Solution {
    public boolean isPowerOfFour(int num) {
        for (int i = 0; Math.pow(4, i) <= num; i++) {
            if (Math.pow(4, i) == num) {
                return true;
            }
        }
        return false;
    }
}
