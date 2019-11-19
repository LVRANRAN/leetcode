import java.util.*;
/*
 * @lc app=leetcode id=1185 lang=java
 *
 * [1185] Day of the Week
 */

// @lc code=start
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        java.util.Calendar cal = new java.util.GregorianCalendar(year, month - 1, day);
        return days[cal.get(java.util.Calendar.DAY_OF_WEEK) - 1];
    }
}
// @lc code=end
