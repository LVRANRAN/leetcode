/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */
class Solution {
    public int countSegments(String s) {
        if (s.length() == 0 || s.trim().length() == 0) {
            return 0;
        }
        int count = 0;
        String[] arr = s.split(" ");
        for (String str : arr) {
            if (!"".equals(str)) {
                count++;
            }
        }
        return count;
    }
}
