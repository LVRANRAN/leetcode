/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] w = word.toCharArray();
        if (word.length() == 1)
            return true;
        if (w[0] <= 'Z') {
            if (w[1] <= 'Z') {
                for (int i = 2; i < w.length; i++) {
                    if (w[i] > 'Z')
                        return false;
                }
            }
            if (w[1] >= 'a') {
                for (int i = 2; i < w.length; i++) {
                    if (w[i] < 'a')
                        return false;
                }
            }
        }
        if (w[0] >= 'a') {
            for (int i = 1; i < w.length; i++) {
                if (w[i] < 'a')
                    return false;
            }
        }
        return true;
    }
}
