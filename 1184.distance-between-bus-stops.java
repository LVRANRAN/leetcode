/*
 * @lc app=leetcode id=1184 lang=java
 *
 * [1184] Distance Between Bus Stops
 */

// @lc code=start
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start == destination)
            return 0;
        int tmp = 0;
        if (start > destination) {
            tmp = start;
            start = destination;
            destination = tmp;
        }
        int sum = 0, res = 0;
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
        }
        for (int i = start; i < destination; i++) {
            res += distance[i];
        }
        return Math.min(res, sum - res);
    }
}
// @lc code=end
