import java.util.*;

/*
 * @lc app=leetcode id=768 lang=java
 *
 * [768] Max Chunks To Make Sorted II
 */

// @lc code=start
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] expected = new int[n];
        for (int i = 0; i < n; i++) {
            expected[i] = arr[i];
        }
        Arrays.sort(expected);
        int res = 0;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
            sum2 += expected[i];
            if (sum1 == sum2)
                res++;
        }
        return res;
    }
}
// @lc code=end
