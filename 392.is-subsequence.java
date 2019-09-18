import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            prev = t.indexOf(s.charAt(i), prev);
            if (prev == -1) {
                return false;
            }
            prev++;
        }
        return true;
    }
}
