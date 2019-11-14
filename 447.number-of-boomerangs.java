import java.util.HashMap;

/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int distance = getDistance(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }
            for (int m : map.values()) {
                res += m * (m - 1);
            }
            map.clear();
        }
        return res;
    }

    public int getDistance(int[] point1, int[] point2) {
        int dx = point2[0] - point1[0];
        int dy = point2[1] - point1[1];
        return dx * dx + dy * dy;
    }
}
