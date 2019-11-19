/*
 * @lc app=leetcode id=1154 lang=java
 *
 * [1154] Day of the Year
 */

// @lc code=start
class Solution {
    public int dayOfYear(String date) {
        String[] s = date.split("-");
        int[] d = new int[3];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.valueOf(s[i]);
        }
        java.util.Calendar cal = new java.util.GregorianCalendar(d[0], d[1] - 1, d[2]);
        return cal.get(java.util.Calendar.DAY_OF_YEAR);
    }
}
// @lc code=end
