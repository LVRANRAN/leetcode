/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        String res = "";
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            res = Integer.toString(carry % 10) + res;
            carry /= 10;
        }
        if (carry == 1) {
            return "1" + res;
        } else {
            return res;
        }
    }
}
