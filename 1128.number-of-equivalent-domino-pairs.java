import java.util.*;
/*
 * @lc app=leetcode id=1128 lang=java
 *
 * [1128] Number of Equivalent Domino Pairs
 */

// @lc code=start
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            int x = Math.max(dominoes[i][0], dominoes[i][1]) * 10 + Math.min(dominoes[i][0], dominoes[i][1]);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int k : map.keySet()) {
            int y = map.get(k);
            sum += y * (y - 1) / 2;
        }
        return sum;
    }
}
// @lc code=end
