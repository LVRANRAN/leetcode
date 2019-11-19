import java.util.*;
/*
 * @lc app=leetcode id=1122 lang=java
 *
 * [1122] Relative Sort Array
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // count the number
        Map<Integer, Integer> countNum = new TreeMap<>();
        for (int i : arr1) {
            if (!countNum.containsKey(i))
                countNum.put(i, 1);
            else
                countNum.put(i, countNum.get(i) + 1);
        }
        // put back
        int index = 0;
        for (int j : arr2) {
            int count = countNum.get(j);
            while (count > 0) {
                arr1[index++] = j;
                count--;
            }
            countNum.remove(j);
        }
        for (int key : countNum.keySet()) {
            int count = countNum.get(key);
            while (count > 0) {
                arr1[index++] = key;
                count--;
            }
        }
        return arr1;
    }
}
// @lc code=end
