/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        if (digits[digits.length - 1] == 9) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    break;
                }
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        if (digits[0] == 0) {
            for (int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }
        return digits;
    }
}
