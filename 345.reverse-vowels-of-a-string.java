/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */
class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] cur = s.toCharArray();
        char tmp;
        while (i < j) {
            if (cur[i] == 'a' || cur[i] == 'o' || cur[i] == 'e' || cur[i] == 'i' || cur[i] == 'u' || cur[i] == 'A'
                    || cur[i] == 'O' || cur[i] == 'E' || cur[i] == 'I' || cur[i] == 'U') {
                if (cur[j] == 'a' || cur[j] == 'o' || cur[j] == 'e' || cur[j] == 'i' || cur[j] == 'u' || cur[j] == 'A'
                        || cur[j] == 'O' || cur[j] == 'E' || cur[j] == 'I' || cur[j] == 'U') {
                    tmp = cur[i];
                    cur[i] = cur[j];
                    cur[j] = tmp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return String.valueOf(cur);
    }
}
