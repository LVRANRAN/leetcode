/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        for (int i = 0; Math.pow(3, i) <= n; i++) {
            if (Math.pow(3, i) == n) {
                return true;
            }
        }
        return false;
    }
}
