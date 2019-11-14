/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        int sign = 1;
        long res = 0;
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            sign = -1;
        }
        long t = Math.abs((long)x);
        while (t != 0) {
            res = t % 10 + res * 10;
            t /= 10;
        }
        if ((sign == 1 && res > Integer.MAX_VALUE) || (sign == -1 && sign * res < Integer.MIN_VALUE))
            return 0;
        return sign * (int) res;
    }
}
