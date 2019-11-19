import jdk.nashorn.internal.runtime.Undefined;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int a = 0;
        String arr = "";
        if (strs.length == 0) {
            return arr;
        }
        int lenWord = strs[0].length();
        for (int j = 0; j < lenWord; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (j >= strs[i].length() || j >= strs[i + 1].length()) {
                    return arr;
                }
                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    return arr;
                }
                a = i;
            }
            arr += strs[a].charAt(j);
        }
        return arr;
    }
}
