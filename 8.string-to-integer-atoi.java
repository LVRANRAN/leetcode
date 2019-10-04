/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */
class Solution {
    public int myAtoi(String str) {

        // 1. whitespaces
        str = str.trim();

        // 2. null or empty string
        if (str == null || str.length() == 0)
            return 0;

        // 3. +/- sign
        boolean positive = true;
        int i = 0;
        if (str.charAt(0) == '+') {
            i++;
        } else if (str.charAt(0) == '-') {
            positive = false;
            i++;
        }

        // 4. calculate real value
        double tmp = 0;
        for (; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';

            if (digit < 0 || digit > 9)
                break;

            // 5. handle min & max
            if (positive) {
                tmp = 10 * tmp + digit;
                if (tmp > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            } else {
                tmp = 10 * tmp - digit;
                if (tmp < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
        }

        int ret = (int) tmp;
        return ret;
    }
}
