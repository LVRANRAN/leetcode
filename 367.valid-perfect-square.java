/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num / 2 + 1; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
