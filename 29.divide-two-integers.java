/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && (divisor == 1 || divisor == -1)) {
            return divisor == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return (int) divideLong(dividend, divisor);
    }

    public long divideLong(long dd, long dv) {
        boolean isPos = (dd > 0 && dv > 0) || (dd < 0 && dv < 0);
        dd = Math.abs(dd);
        dv = Math.abs(dv);
        int digits = 0;
        // 通过将除数乘2，乘4，乘8，一直乘下去，找到商的最高的次方
        // 比如87/4=21，商的最高次方是4，即2^4=16，即4 * 16 < 87
        while (dv <= dd) {
            dv <<= 1;
            digits++;
        }
        // 重置除数，把最高次方减1得到实际最高位，刚才循环中多加了一次
        long res = 0;
        dv >>= digits;
        digits--;
        // 看商的每一位是否应该为1
        while (digits >= 0) {
            if (dd >= (dv << digits)) {
                dd -= dv << digits;
                res += 1 << digits;
            }
            digits--;
            System.out.println(res);
        }
        return isPos ? res : -res;
    }
}
