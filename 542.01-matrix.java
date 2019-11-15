import java.util.*;
/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start
class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dirs = {{0,-1},{-1,0},{0,1},{1,0}};
        Queue<List<Integer>> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    List<Integer> point = new ArrayList<>();
                    point.add(i);
                    point.add(j);
                    q.add(point);
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while (!q.isEmpty()) {
            List<Integer> tmp = q.poll();
            for (int[] dir : dirs) {
                int x = tmp.get(0) + dir[0], y = tmp.get(1) + dir[1];
                if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] <= matrix[tmp.get(0)][tmp.get(1)] + 1)
                    continue;
                matrix[x][y] = matrix[tmp.get(0)][tmp.get(1)] + 1;
                List<Integer> point = new ArrayList<>();
                point.add(x);
                point.add(y);
                q.add(point);
                q.add(point);
            }
        }
        return matrix;
    }
}
// @lc code=end

