import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0 || points[0].length == 0 || points == null)
            return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        int[] tmp = points[0];
        int sum = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > tmp[1]) {
                tmp = points[i];
                sum++;
            }
        }
        return sum;
    }
}
// @lc code=end
