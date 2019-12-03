import java.util.*;

/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int[] h = new int[n + 1];
        for (int i = 0; i < n; i++) {
            h[i] = heights[i];
        }
        h[n] = 0;
        for (int i = 0; i < h.length; i++) {
            while (!s.isEmpty() && h[s.peek()] >= h[i]) {
                int cur = s.pop();
                res = Math.max(res, h[cur] * (s.isEmpty()? i : (i - s.peek() - 1)));
            }
            s.add(i);
        }
        return res;
    }
}
// @lc code=end
