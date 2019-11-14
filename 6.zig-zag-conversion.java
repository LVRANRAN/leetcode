/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */
class Solution {
    public String convert(String s, int numRows) {
        if (s == null || numRows <= 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int index = 0;
        while (index < s.length()) {
            for (int i = 0; i < numRows && index < s.length(); i++) {
                sb[i].append(s.charAt(index++));
            }
            for (int j = numRows - 2; j >= 1 && index < s.length(); j--) {
                sb[j].append(s.charAt(index++));
            }
        }
        for (int i = 0; i < numRows; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }
}
