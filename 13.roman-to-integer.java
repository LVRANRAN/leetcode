/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int res = 0;
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'I') {
                res += 1;
            }
            if (c == 'V') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    res += 4;
                    i--;
                } else {
                    res += 5;
                }
            }
            if (c == 'X') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    res += 9;
                    i--;
                } else {
                    res += 10;
                }
            }
            if (c == 'L') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    res += 40;
                    i--;
                } else {
                    res += 50;
                }
            }
            if (c == 'C') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    res += 90;
                    i--;
                } else {
                    res += 100;
                }
            }
            if (c == 'D') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    res += 400;
                    i--;
                } else {
                    res += 500;
                }
            }
            if (c == 'M') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    res += 900;
                    i--;
                } else {
                    res += 1000;
                }
            }
        }
        return res;
    }
}
