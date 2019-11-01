import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=646 lang=java
 *
 * [646] Maximum Length of Pair Chain
 */

// @lc code=start
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int[] dp = new int[pairs.length];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if(pairs[j][1] < pairs[i][0])
                    max = Math.max(max, dp[j] + 1);
            }
            dp[i] = max;
        }
        return dp[pairs.length - 1];
    }
}
// @lc code=end
