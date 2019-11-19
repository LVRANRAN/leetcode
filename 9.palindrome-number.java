/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int length = 1;
        while (x / length >= 10) {
            length = length * 10;
        }
        while (x > 0) {
            int l = x / length;
            int r = x % 10;
            if (l != r) {
                return false;
            }
            x = (x % length) / 10; //去掉头和尾
            length = length / 100;
        }
        return true;
    }
}
