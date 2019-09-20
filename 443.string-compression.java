/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */
class Solution {
    public int compress(char[] chars) {
        int sum = 0, index = 0;
        while (index < chars.length) {
            char current = chars[index];
            int num = 0;
            while (index < chars.length && chars[index] == current) {
                index++;
                num++;
            }
            chars[sum++] = current;
            if (num != 1) {
                for (char ch : (num+"").toCharArray()) {
                    chars[sum++] = ch;
                }
            }
        }
        return sum;
    }
}
