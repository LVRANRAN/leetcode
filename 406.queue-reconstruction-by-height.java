import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=406 lang=java
 *
 * [406] Queue Reconstruction by Height
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length == 0 || people[0].length == 0 || people == null)
            return new int[0][0];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        int[][] res = list.toArray(new int[people.length][]);
        return res;
    }
}
// @lc code=end
