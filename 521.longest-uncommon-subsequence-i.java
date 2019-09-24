/*
 * @lc app=leetcode id=521 lang=java
 *
 * [521] Longest Uncommon Subsequence I 
 */
class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
