/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, total = 0, index = 0;
        for (int i = 0; i < cost.length; i++) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0){
                index = i + 1;
                sum = 0;
            }
        }
        return total < 0 ? -1 : index;
    }
}
// @lc code=end
