import java.util.*;

/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                int old = triangle.get(i).get(j);
                triangle.get(i).set(j, Math.min(triangle.get(i+1).get(j)
                                , triangle.get(i+1).get(j+1))+old);
            }
        }
        return triangle.get(0).get(0);
    }
}
// @lc code=end
