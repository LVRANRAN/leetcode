/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */
class Solution {
    public boolean checkRecord(String s) {
        if (s.indexOf('A') != s.lastIndexOf('A')) {
            return false;
        }
        if (s.indexOf("LLL") != -1) {
            return false;
        }
        return true;
    }
}
