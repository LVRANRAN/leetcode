import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0 || intervals[0].length == 0 || intervals == null)
            return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        int[] tmp = intervals[0];
        int sum = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= tmp[1]) {
                tmp = intervals[i];
                sum++;
            }
        }
        return intervals.length - sum;
    }
}
// @lc code=end

