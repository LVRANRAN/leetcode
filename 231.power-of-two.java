/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; Math.pow(2, i) <= n; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }
        }
        return false;
    }
}
