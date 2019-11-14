/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */
class Solution {
    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt(8 * (long) n + 1) - 1) / 2);
    }
}
