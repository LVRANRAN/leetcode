/*
 * @lc app=leetcode id=714 lang=java
 *
 * [714] Best Time to Buy and Sell Stock with Transaction Fee
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0, hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, prices[i] + hold - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
// @lc code=end
