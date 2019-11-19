/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */
class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while (n != 0) {
            int temp = (n - 1) % 26;
            s = (char) ('A' + temp) + s;
            n = (n - 1) / 26;
        }
        return s;
    }
}
