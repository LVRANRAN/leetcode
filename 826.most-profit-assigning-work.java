package org.apache.commons.lang3.tuple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

/*
 * @lc app=leetcode id=826 lang=java
 *
 * [826] Most Profit Assigning Work
 */

// @lc code=start
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int best = 0, res = 0, i = 0;
        List<Pair<Integer, Integer>> list = new ArrayList<Pair<Integer, Integer>>();
        int n = difficulty.length;
        for (int j = 0; j < n; j++) {
            list.add(new Pair<Integer, Integer>(difficulty[i], profit[i]));
        }
        Collections.sort(list, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                return p1.getValue() - p2.getValue();
            }
        });
        Arrays.sort(worker);
        for (int ability : worker) {
            while (i < N && ability > list.get(i).getKey()) {
                best = Math.max(best, list.get(i++).getValue());
            }
            res += best;
        }
        return res;
    }
}
// @lc code=end
